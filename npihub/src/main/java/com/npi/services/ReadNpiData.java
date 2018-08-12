package com.npi.services;

import com.npi.dao.NpiDao;
import com.npi.pojo.NpiData;

public class ReadNpiData {

	public static void main(String[] args) {
		System.out.println("ReadNpiData - Started");
		NpiDao npiDao = new NpiDao();
		
		NpiData npi = npiDao.getNpiData("1700889078");
		
		System.out.println(npi.getNPI() + "<>" + npi.getPvFirstName());
		System.out.println("ReadNpiData - Ended");
	}

}
