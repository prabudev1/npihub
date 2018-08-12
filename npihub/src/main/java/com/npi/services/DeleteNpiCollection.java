package com.npi.services;

import com.npi.dao.NpiDao;
import com.npi.pojo.NpiData;

public class DeleteNpiCollection {

	public static void main(String[] args) {
		System.out.println("DeleteNpiCollection - Started");
		
		NpiDao npiDao = new NpiDao();
		npiDao.deleteNpiCollection();

		System.out.println("DeleteNpiCollection - Ended");
	}
	
}
