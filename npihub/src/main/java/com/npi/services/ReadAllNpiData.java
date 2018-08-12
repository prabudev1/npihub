package com.npi.services;

import java.util.List;

import org.bson.Document;

import com.npi.dao.NpiDao;
import com.npi.pojo.NpiData;

public class ReadAllNpiData {

	public static void main(String[] args) {
		System.out.println("ReadAllNpiData - Started");
		NpiDao npiDao = new NpiDao();
		List<NpiData> npiList = npiDao.readAllNpiData(); 
		for (NpiData npi : npiList) {
			System.out.println(npi.getNPI() + " : " + npi.getPvFirstName());
		}
		System.out.println("ReadAllNpiData - Ended");
	}
	
}
