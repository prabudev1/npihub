package com.npi.common;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.npi.pojo.NpiData;

public class MongoExample {
	
	public static String MONGO_CONNECTION_STRING = "mongodb+srv://prabu:prabu@npicluster-h60v4.gcp.mongodb.net/test?retryWrites=true";
	public static String MONGO_DATABASE_NAME = "test";
	public static String MONGO_COLLECTION_NAME = "myNpiCollection-1";
	
	public static void main(String[] args) {

		MongoClientOptions.Builder options_builder = new MongoClientOptions.Builder();
	    options_builder.maxConnectionIdleTime(10000);
	    MongoClientOptions options = options_builder.build();
	    
	    
	    CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
	    
		MongoClientURI uri = new MongoClientURI(MONGO_CONNECTION_STRING);
		
		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase(MONGO_DATABASE_NAME);
		
		/* COLLECTION */
		
		MongoCollection myCollection = database.getCollection(MONGO_COLLECTION_NAME);
		if (myCollection == null ) {
			database.createCollection(MONGO_COLLECTION_NAME);
			myCollection = database.getCollection(MONGO_COLLECTION_NAME);
		}
		
		/* SETTING DATA */
		
		NpiData npi = getNpiData();
		UpdateOptions uOptions = new UpdateOptions();
		uOptions.upsert(Boolean.TRUE);
		
		Document npiDoc = convertNpiToDB(npi);
		myCollection.updateOne(Filters.eq("employerIdentificationNumber", npi.getEmployerIdentificationNumber()), npiDoc, uOptions);
		// myCollection.insertOne(npiDoc);
		
		/* RETRIVING DATA */
		List<Document> npiList = (List<Document>) myCollection.find().into(new ArrayList<Document>());
		for (Document npiLoop : npiList) {
			System.out.println(npiLoop.get("employerIdentificationNumber") + " : " + npiLoop.get("providerFirstName"));
		}
		
		// REMOVING COLLECTION FOR TESTING PURPOSE
		myCollection.drop();
		
		mongoClient.close();
		System.out.println("End");
	}

	public static NpiData getNpiData() {
		NpiData npi = new NpiData();
//		npi.setNPI("NPI-001");
//		npi.setEmployerIdentificationNumber("NPI-001");
//		npi.setProviderFirstName("Prabu Devarajan");
//		npi.setProviderLastName("Devarajan");
		return npi;
	}
	
	public static Document convertNpiToDB (NpiData npi) {
		Document basicDocObject = new Document();
		Document basicDBObject = new Document();
//        basicDBObject.append("NPI", npi.getNPI());
//        basicDBObject.append("employerIdentificationNumber", npi.getEmployerIdentificationNumber());
//        basicDBObject.append("providerFirstName", npi.getProviderFirstName());
//        basicDBObject.append("providerLastName", npi.getProviderLastName());
        basicDocObject.append("$set", basicDBObject);
        return basicDocObject;
	}
}
