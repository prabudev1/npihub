package com.npi.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaExample {

	public static void main(String[] arg) {
		System.out.println("Hello Welcome again");
		List<String> myList = new ArrayList<String>();
		myList.add("Jan");
		myList.add("Feb");
		myList.add("Mar");
		myList.add("Apr");
		myList.add("May");
		
		for (String val : myList) {
			System.out.println("Orginal List: " + val);
		}
		
		List<String> myConvertedList = myList.stream().map(val -> (val.toUpperCase() + " MY STRING")).collect(Collectors.toList());
		for (String val : myConvertedList) {
			System.out.println("Orginal List: " + val);
		}
		
	}
}
