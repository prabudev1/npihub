package com.npi.services;

import java.util.List;

import com.npi.dao.NpiDao;
import com.npi.pojo.NpiData;

public class LoadNpiData {

	public static void main(String[] args) {
		System.out.println("LoadNpiData - Started");
		String filePath = "C:\\Users\\prabu.devarajan\\Desktop\\NPI\\NPPES_Data_Dissemination_July_2018\\npidata_pfile_20050523-20180708.csv";
		CsvReader csv = new CsvReader();
		NpiDao npiDao = new NpiDao();
		
		List<NpiData> npiList = csv.processInputFile(filePath);
		System.out.println("LoadNpiData - CSV file length - " + npiList.size());	

		for (NpiData npi : npiList) {
			System.out.println(npi.getNPI() + " : " + npi.getPvFirstName());
		}
		npiDao.loadNpiData(npiList);
		System.out.println("LoadNpiData - Ended");
	}

	public static NpiData getNpiData(int counter) {
		NpiData npi = new NpiData();
		npi.setNPI("NPI-" + counter);
		npi.setEmployerIdentificationNumber("EIN-" + counter);
		npi.setPvFirstName("ProviderFirstName - " + counter);
		npi.setPvLastName("sProviderLastName - " + counter);
		return npi;
	}

}
