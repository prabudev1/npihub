package com.npi.services;

import java.util.List;

import org.bson.Document;

import com.npi.dao.NpiDao;
import com.npi.pojo.NpiData;

public class ReadAllNpiDataByName {

	public static void main(String[] args) {
		System.out.println("ReadAllNpiDataByName - Started");
		NpiDao npiDao = new NpiDao();
		List<NpiData> npiList = npiDao.getNpiByName("MARIN", 1, 100);
		for (NpiData npi : npiList) {
			System.out.println(npi.getNPI() + " : " + npi.getPvFirstName() + " : " + npi.getPvLastName() + " : "
					+ npi.getPvMiddleName());
		}
		System.out.println("ReadAllNpiDataByName - Ended");
	}

}
