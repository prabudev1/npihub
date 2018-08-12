package com.npi.common;

import java.util.Arrays;
import java.util.List;

public class TryOut {

	public static void main(String[] args) {
		String str = "\"1588667638\",\"1\",\"\",\"\",\"\",\"PILC,HER\",\"WILLIAM\",\"C\",\"DR.\",\"\",\"MD\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"1824 KING STREET\",\"SUITE 300\",\"JACKSONVILLE\",\"FL\",\"322044736\",\"US\",\"9043881820\",\"9043881827\",\"1824 KING STREET\",\"SUITE 300\",\"JACKSONVILLE\",\"FL\",\"322044736\",\"US\",\"9043881820\",\"9043881827\",\"05/23/2005\",\"05/29/2014\",\"\",\"\",\"\",\"M\",\"\",\"\",\"\",\"\",\"\",\"207RC0000X\",\"ME68414\",\"FL\",\"Y\",\"207RC0000X\",\"032024\",\"GA\",\"N\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"0897705\",\"01\",\"FL\",\"AETNA\",\"00532485C\",\"05\",\"GA\",\"\",\"251286600\",\"05\",\"FL\",\"\",\"00706626A\",\"05\",\"GA\",\"\",\"27888\",\"01\",\"FL\",\"BCBS\",\"510265\",\"01\",\"GA\",\"BCBS\",\"208143\",\"01\",\"FL\",\"AVMED\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"N\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"";
		splitSolution1(str);
	}

	
	public static void splitSolution4(String str) {
		List<String> arr = Arrays.asList(str);
		for (String string : arr) {
			System.out.println(string);
		}
	}
	
	public static void splitSolution3(String str) {
		String[] arr = str.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		for (String string : arr) {
			System.out.println(string);
		}
	}
	
	public static void splitSolution2(String str) {
		String[] arr = str.split("\"[^\"]*\"|[^,]+");
		for (String string : arr) {
			System.out.println(string);
		}
	}
	
	public static void splitSolution1(String str) {
		String[] arr = str.split("(?x)   " + ",          " + // Split on comma
				"(?=        " + // Followed by
				"  (?:      " + // Start a non-capture group
				"    [^\"]* " + // 0 or more non-quote characters
				"    \"     " + // 1 quote
				"    [^\"]* " + // 0 or more non-quote characters
				"    \"     " + // 1 quote
				"  )*       " + // 0 or more repetition of non-capture group (multiple of 2 quotes will be even)
				"  [^\"]*   " + // Finally 0 or more non-quotes
				"  $        " + // Till the end (This is necessary, else every comma will satisfy the condition)
				")          " // End look-ahead
		);
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
