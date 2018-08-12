package com.npi.dao;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.QueryParam;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.npi.pojo.NpiData;

public class NpiDao {

	private String MONGO_CONNECTION_STRING = "mongodb+srv://prabu:prabu@npicluster-h60v4.gcp.mongodb.net/test?retryWrites=true";
	private String MONGO_DATABASE_NAME = "test";
	private String MONGO_COLLECTION_NAME = "myNpiCollection-1";

	@SuppressWarnings("resource")
	private MongoClient getMongoClient() {
		MongoClientURI uri = new MongoClientURI(MONGO_CONNECTION_STRING);
		MongoClient mongoClient = new MongoClient(uri);
		return mongoClient;
	}

	@SuppressWarnings("resource")
	private MongoCollection<NpiData> getMongoCollection(MongoClient mongoClient) {
		/* ACCESS DATABASE, IF NOT CREATE NEW ONE WITH SPECIFIED NAME */
		MongoDatabase database = mongoClient.getDatabase(MONGO_DATABASE_NAME);

		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
				fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		database = database.withCodecRegistry(pojoCodecRegistry);

		/* ACCESS COLLECTION, IF NOT CREATE NEW ONE WITH SPECIFIED NAME */
		MongoCollection<NpiData> myCollection = database.getCollection(MONGO_COLLECTION_NAME, NpiData.class);
		if (myCollection == null) {
			database.createCollection(MONGO_COLLECTION_NAME);
			myCollection = database.getCollection(MONGO_COLLECTION_NAME, NpiData.class);
		}
		return myCollection;
	}

	private void closeMongoClient(MongoClient mongoClient) {
		mongoClient.close();
	}

	public void loadNpiData(List<NpiData> npiList) {
		MongoClient mongoClient = getMongoClient();
		MongoCollection<NpiData> myCollection = getMongoCollection(mongoClient);

		myCollection.insertMany(npiList);

		closeMongoClient(mongoClient);
	}

	public List<NpiData> readAllNpiData() {
		MongoClient mongoClient = getMongoClient();
		MongoCollection<NpiData> myCollection = getMongoCollection(mongoClient);

		List<NpiData> npiList = new ArrayList<>();
		Block<NpiData> printBlock = new Block<NpiData>() {
			@Override
			public void apply(final NpiData npi) {
				npiList.add(npi);
			}
		};

		myCollection.find().forEach(printBlock);

		closeMongoClient(mongoClient);
		return npiList;
	}

	public NpiData getNpiData(String npiId) {
		MongoClient mongoClient = getMongoClient();
		MongoCollection<NpiData> myCollection = getMongoCollection(mongoClient);

		Bson idFilter = Filters.eq("nPI", npiId);
		NpiData npi = myCollection.find(idFilter).first();

		closeMongoClient(mongoClient);
		return npi;
	}

	public List<NpiData> getNpiByName(String name, int startIndex, int maxRecords) {
		MongoClient mongoClient = getMongoClient();
		MongoCollection<NpiData> myCollection = getMongoCollection(mongoClient);

		List<NpiData> npiList = new ArrayList<>();
		Block<NpiData> printBlock = new Block<NpiData>() {
			@Override
			public void apply(final NpiData npi) {
				npiList.add(npi);
			}
		};

		Bson nameFilters = Filters.or(Filters.eq("pvFirstName", name), Filters.eq("pvLastName", name), Filters.eq("pvMiddleName", name));
		myCollection.find(nameFilters).forEach(printBlock);
		// myCollection.find(nameFilters).skip(startIndex).limit(maxRecords).forEach(printBlock);

		closeMongoClient(mongoClient);
		return npiList;
	}

	public void deleteNpiCollection() {
		MongoClient mongoClient = getMongoClient();
		MongoCollection<NpiData> myCollection = getMongoCollection(mongoClient);

		myCollection.drop();

		closeMongoClient(mongoClient);
	}

}
