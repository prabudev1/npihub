package com.npi.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public int counter;
	
	public static void main(String[] args) {
		System.out.println("Started");
		String filePath = "C:\\Users\\prabu.devarajan\\Desktop\\NPI\\NPPES_Data_Dissemination_July_2018\\npidata_pfile_20050523-20180708.csv";
		Test ob = new Test();
		
		List<NpiExportItem> inputList = ob.processInputFile(filePath);
		System.out.println("Count: " + inputList.size());
	}
	
	public List<NpiExportItem> processInputFile(String inputFilePath) {
	    List<NpiExportItem> inputList = new ArrayList<NpiExportItem>();
	    
	    try{
	      File inputF = new File(inputFilePath);
	      InputStream inputFS = new FileInputStream(inputF);
	      BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
	      System.out.println("File Reading Process Started");
	      // skip the header of the csv
	      inputList = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
	      // inputList = br.lines().skip(1).collect(Collectors.toList());
	      System.out.println("File Reading Process Ended");
	      br.close();
	      System.out.println("File Reading Process Closed");
	    } catch (Exception e) {
	      System.out.println("Pocha solamutha : " + e.getMessage());
	    }
	    return inputList ;
	}
	
	private Function<String, NpiExportItem> mapToItem = (line) -> {
		System.out.println((counter++) + " : " + line);
		String[] p = line.split(",");// a CSV has comma separated lines
		NpiExportItem item = new NpiExportItem();
		  item.setEin(p[0]);//<-- this is the first column in the csv file
		  if (p[3] != null && p[3].trim().length() > 0) {
		    item.setFirstName(p[3]);
		  }
		  //more initialization goes here
		  return item;
	
	};
}
