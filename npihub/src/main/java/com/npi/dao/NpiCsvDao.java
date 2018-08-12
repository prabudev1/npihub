package com.npi.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.npi.common.NpiExportItem;
import com.npi.common.Test;

public class NpiCsvDao {

	private String NPI_CSV_FILE_PATH = "C:\\Users\\prabu.devarajan\\Desktop\\NPI\\NPPES_Data_Dissemination_July_2018\\npidata_pfile_20050523-20180708.csv";
	private int recCounter;

	public List<NpiExportItem> processInputFile() {
		List<NpiExportItem> inputList = new ArrayList<NpiExportItem>();
		try {
			File inputF = new File(NPI_CSV_FILE_PATH);
			InputStream inputFS = new FileInputStream(inputF);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
			recCounter = 0;
			// skip the header of the csv
			inputList = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
			// inputList = br.lines().skip(1).collect(Collectors.toList());
			br.close();
		} catch (Exception e) {
			System.out.println("Pocha solamutha : " + e.getMessage());
		}
		return inputList;
	}

	private Function<String, NpiExportItem> mapToItem = (line) -> {
		System.out.println((recCounter++) + " : " + line);
		String[] p = line.split(",");// a CSV has comma separated lines
		NpiExportItem item = new NpiExportItem();
		item.setEin(p[0]);// <-- this is the first column in the csv file
		if (p[3] != null && p[3].trim().length() > 0) {
			item.setFirstName(p[3]);
		}
		// more initialization goes here
		return item;

	};

}
