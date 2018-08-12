package com.npi.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.npi.pojo.NpiData;

public class CsvReader {

	int fileCounter = 0;
	
	int recStartIndex = 1; // Use 1 for ignoring header  
	int recEndIndex = 0;
	
	public List<NpiData> processInputFile(String inputFilePath) {
		return processInputFile(inputFilePath, 1, 10000);
	}
	
	public List<NpiData> processInputFile(String inputFilePath, int startIndex, int endIndex) {
		List<NpiData> inputList = new ArrayList<NpiData>();

		recStartIndex = startIndex;
		recEndIndex = endIndex;
		
		try {
			File inputF = new File(inputFilePath);
			InputStream inputFS = new FileInputStream(inputF);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
			inputList = br.lines().skip(startIndex).map(mapToItem).limit(endIndex).collect(Collectors.toList());
			br.close();
		} catch (Exception e) {
			System.out.println("Pocha solamutha : " + e.getMessage());
		}
		return inputList;
	}

	private Function<String, NpiData> mapToItem = (line) -> {
		List<String> csvDataArr = splitSolution(line);
		int cellIndex = 0;
		NpiData npiItem = new NpiData();
		if (csvDataArr.size() > 55) {
			npiItem.setNPI(csvDataArr.get(cellIndex++));
			npiItem.setEntityTypeCode(csvDataArr.get(cellIndex++));
			npiItem.setReplacementNPI(csvDataArr.get(cellIndex++));
			npiItem.setEmployerIdentificationNumber(csvDataArr.get(cellIndex++));
			npiItem.setPvOrganizationName(csvDataArr.get(cellIndex++));
			npiItem.setPvLastName(csvDataArr.get(cellIndex++));
			npiItem.setPvFirstName(csvDataArr.get(cellIndex++));
			npiItem.setPvMiddleName(csvDataArr.get(cellIndex++));
			npiItem.setPvNamePrefixText(csvDataArr.get(cellIndex++));
			npiItem.setPvNameSuffixText(csvDataArr.get(cellIndex++));
			npiItem.setPvCredentialText(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherOrganizationName(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherOrganizationNameTypeCode(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherLastName(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherFirstName(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherMiddleName(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherNamePrefixText(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherNameSuffixText(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherCredentialText(csvDataArr.get(cellIndex++));
			npiItem.setPvOtherLastNameTypeCode(csvDataArr.get(cellIndex++));
			npiItem.setPvFirstLineBusinessMailingAddress(csvDataArr.get(cellIndex++));
			npiItem.setPvSecondLineBusinessMailingAddress(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessMailingAddressCityName(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessMailingAddressStateName(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessMailingAddressPostalCode(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessMailingAddressCountryCode(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessMailingAddressTelephoneNumber(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessMailingAddressFaxNumber(csvDataArr.get(cellIndex++));
			npiItem.setPvFirstLineBusinessPracticeLocationAddress(csvDataArr.get(cellIndex++));
			npiItem.setPvSecondLineBusinessPracticeLocationAddress(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessPracticeLocationAddressCityName(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessPracticeLocationAddressStateName(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessPracticeLocationAddressPostalCode(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessPracticeLocationAddressCountryCode(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessPracticeLocationAddressTelephoneNumber(csvDataArr.get(cellIndex++));
			npiItem.setPvBusinessPracticeLocationAddressFaxNumber(csvDataArr.get(cellIndex++));
			npiItem.setPvEnumerationDate(csvDataArr.get(cellIndex++));
			npiItem.setLastUpdateDate(csvDataArr.get(cellIndex++));
			npiItem.setnPIDeactivationReasonCode(csvDataArr.get(cellIndex++));
			npiItem.setnPIDeactivationDate(csvDataArr.get(cellIndex++));
			npiItem.setnPIReactivationDate(csvDataArr.get(cellIndex++));
			npiItem.setPvGenderCode(csvDataArr.get(cellIndex++));
			npiItem.setAuthorizedOfficialLastName(csvDataArr.get(cellIndex++));
			npiItem.setAuthorizedOfficialFirstName(csvDataArr.get(cellIndex++));
			npiItem.setAuthorizedOfficialMiddleName(csvDataArr.get(cellIndex++));
			npiItem.setAuthorizedOfficialTitleorPosition(csvDataArr.get(cellIndex++));
			npiItem.setAuthorizedOfficialTelephoneNumber(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_1(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_1(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_1(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_1(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_2(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_2(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_2(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_2(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_3(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_3(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_3(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_3(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_4(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_4(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_4(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_4(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_5(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_5(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_5(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_5(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_6(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_6(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_6(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_6(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_7(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_7(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_7(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_7(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_8(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_8(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_8(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_8(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_9(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_9(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_9(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_9(csvDataArr.get(cellIndex++));			
			npiItem.setHealthcareProviderTaxonomyCode_10(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumber_10(csvDataArr.get(cellIndex++));
			npiItem.setProviderLicenseNumberStateCode_10(csvDataArr.get(cellIndex++));
			npiItem.setHealthcareProviderPrimaryTaxonomySwitch_10(csvDataArr.get(cellIndex++));
		}
		return npiItem;
	};
	
	private List<String> splitSolution(String str) {
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
		List<String> arrayList = Stream.of(arr).map(s -> trimQuotes(s)).collect(Collectors.toList());
		return arrayList;
	}
	
	private String trimQuotes(String str) {
		if (str.startsWith("\"") && str.endsWith("\"")) {
			str = str.substring(1, str.length()-1);
		}
		return str;
	}
	
}
