package com.npi.pojo;

public class NpiData {

	private static final long serialVersionUID = 5774544572701987457L;

	private String NPI;
	private String entityTypeCode;
	private String replacementNPI;
	private String employerIdentificationNumber; // EIN
	private String pvOrganizationName; // LegalBusinessName
	private String pvLastName; // LegalName
	private String pvFirstName;
	private String pvMiddleName;
	private String pvNamePrefixText;
	private String pvNameSuffixText;
	private String pvCredentialText;
	private String pvOtherOrganizationName;
	private String pvOtherOrganizationNameTypeCode;
	private String pvOtherLastName;
	private String pvOtherFirstName;
	private String pvOtherMiddleName;
	private String pvOtherNamePrefixText;
	private String pvOtherNameSuffixText;
	private String pvOtherCredentialText;
	private String pvOtherLastNameTypeCode;
	private String pvFirstLineBusinessMailingAddress;
	private String pvSecondLineBusinessMailingAddress;
	private String pvBusinessMailingAddressCityName;
	private String pvBusinessMailingAddressStateName;
	private String pvBusinessMailingAddressPostalCode;
	private String pvBusinessMailingAddressCountryCode; // IfoutsideU.S.
	private String pvBusinessMailingAddressTelephoneNumber;
	private String pvBusinessMailingAddressFaxNumber;
	private String pvFirstLineBusinessPracticeLocationAddress;
	private String pvSecondLineBusinessPracticeLocationAddress;
	private String pvBusinessPracticeLocationAddressCityName;
	private String pvBusinessPracticeLocationAddressStateName;
	private String pvBusinessPracticeLocationAddressPostalCode;
	private String pvBusinessPracticeLocationAddressCountryCode; // IfoutsideU.S.

	private String pvBusinessPracticeLocationAddressTelephoneNumber;
	private String pvBusinessPracticeLocationAddressFaxNumber;
	private String pvEnumerationDate;
	private String lastUpdateDate;
	private String nPIDeactivationReasonCode;
	private String nPIDeactivationDate;
	private String nPIReactivationDate;
	private String pvGenderCode;
	private String authorizedOfficialLastName;
	private String authorizedOfficialFirstName;
	private String authorizedOfficialMiddleName;
	private String authorizedOfficialTitleorPosition;
	private String authorizedOfficialTelephoneNumber;

	private String healthcareProviderTaxonomyCode_1;
	private String providerLicenseNumber_1;
	private String providerLicenseNumberStateCode_1;
	private String healthcareProviderPrimaryTaxonomySwitch_1;

	private String healthcareProviderTaxonomyCode_2;
	private String providerLicenseNumber_2;
	private String providerLicenseNumberStateCode_2;
	private String healthcareProviderPrimaryTaxonomySwitch_2;

	private String healthcareProviderTaxonomyCode_3;
	private String providerLicenseNumber_3;
	private String providerLicenseNumberStateCode_3;
	private String healthcareProviderPrimaryTaxonomySwitch_3;

	private String healthcareProviderTaxonomyCode_4;
	private String providerLicenseNumber_4;
	private String providerLicenseNumberStateCode_4;
	private String healthcareProviderPrimaryTaxonomySwitch_4;

	private String healthcareProviderTaxonomyCode_5;
	private String providerLicenseNumber_5;
	private String providerLicenseNumberStateCode_5;
	private String healthcareProviderPrimaryTaxonomySwitch_5;

	private String healthcareProviderTaxonomyCode_6;
	private String providerLicenseNumber_6;
	private String providerLicenseNumberStateCode_6;
	private String healthcareProviderPrimaryTaxonomySwitch_6;

	private String healthcareProviderTaxonomyCode_7;
	private String providerLicenseNumber_7;
	private String providerLicenseNumberStateCode_7;
	private String healthcareProviderPrimaryTaxonomySwitch_7;

	private String healthcareProviderTaxonomyCode_8;
	private String providerLicenseNumber_8;
	private String providerLicenseNumberStateCode_8;
	private String healthcareProviderPrimaryTaxonomySwitch_8;

	private String healthcareProviderTaxonomyCode_9;
	private String providerLicenseNumber_9;
	private String providerLicenseNumberStateCode_9;
	private String healthcareProviderPrimaryTaxonomySwitch_9;

	private String healthcareProviderTaxonomyCode_10;
	private String providerLicenseNumber_10;
	private String providerLicenseNumberStateCode_10;
	private String healthcareProviderPrimaryTaxonomySwitch_10;

	private String isSoleProprietor;
	private String isOrganizationSubpart;
	private String parentOrganizationLBN;
	private String parentOrganizationTIN;
	private String authorizedOfficialNamePrefixText;
	private String authorizedOfficialNameSuffixText;
	private String authorizedOfficialCredentialText;

	public String getNPI() {
		return NPI;
	}

	public void setNPI(String nPI) {
		NPI = nPI;
	}

	public String getEntityTypeCode() {
		return entityTypeCode;
	}

	public void setEntityTypeCode(String entityTypeCode) {
		this.entityTypeCode = entityTypeCode;
	}

	public String getReplacementNPI() {
		return replacementNPI;
	}

	public void setReplacementNPI(String replacementNPI) {
		this.replacementNPI = replacementNPI;
	}

	public String getEmployerIdentificationNumber() {
		return employerIdentificationNumber;
	}

	public void setEmployerIdentificationNumber(String employerIdentificationNumber) {
		this.employerIdentificationNumber = employerIdentificationNumber;
	}

	public String getPvOrganizationName() {
		return pvOrganizationName;
	}

	public void setPvOrganizationName(String pvOrganizationName) {
		this.pvOrganizationName = pvOrganizationName;
	}

	public String getPvLastName() {
		return pvLastName;
	}

	public void setPvLastName(String pvLastName) {
		this.pvLastName = pvLastName;
	}

	public String getPvFirstName() {
		return pvFirstName;
	}

	public void setPvFirstName(String pvFirstName) {
		this.pvFirstName = pvFirstName;
	}

	public String getPvMiddleName() {
		return pvMiddleName;
	}

	public void setPvMiddleName(String pvMiddleName) {
		this.pvMiddleName = pvMiddleName;
	}

	public String getPvNamePrefixText() {
		return pvNamePrefixText;
	}

	public void setPvNamePrefixText(String pvNamePrefixText) {
		this.pvNamePrefixText = pvNamePrefixText;
	}

	public String getPvNameSuffixText() {
		return pvNameSuffixText;
	}

	public void setPvNameSuffixText(String pvNameSuffixText) {
		this.pvNameSuffixText = pvNameSuffixText;
	}

	public String getPvCredentialText() {
		return pvCredentialText;
	}

	public void setPvCredentialText(String pvCredentialText) {
		this.pvCredentialText = pvCredentialText;
	}

	public String getPvOtherOrganizationName() {
		return pvOtherOrganizationName;
	}

	public void setPvOtherOrganizationName(String pvOtherOrganizationName) {
		this.pvOtherOrganizationName = pvOtherOrganizationName;
	}

	public String getPvOtherOrganizationNameTypeCode() {
		return pvOtherOrganizationNameTypeCode;
	}

	public void setPvOtherOrganizationNameTypeCode(String pvOtherOrganizationNameTypeCode) {
		this.pvOtherOrganizationNameTypeCode = pvOtherOrganizationNameTypeCode;
	}

	public String getPvOtherLastName() {
		return pvOtherLastName;
	}

	public void setPvOtherLastName(String pvOtherLastName) {
		this.pvOtherLastName = pvOtherLastName;
	}

	public String getPvOtherFirstName() {
		return pvOtherFirstName;
	}

	public void setPvOtherFirstName(String pvOtherFirstName) {
		this.pvOtherFirstName = pvOtherFirstName;
	}

	public String getPvOtherMiddleName() {
		return pvOtherMiddleName;
	}

	public void setPvOtherMiddleName(String pvOtherMiddleName) {
		this.pvOtherMiddleName = pvOtherMiddleName;
	}

	public String getPvOtherNamePrefixText() {
		return pvOtherNamePrefixText;
	}

	public void setPvOtherNamePrefixText(String pvOtherNamePrefixText) {
		this.pvOtherNamePrefixText = pvOtherNamePrefixText;
	}

	public String getPvOtherNameSuffixText() {
		return pvOtherNameSuffixText;
	}

	public void setPvOtherNameSuffixText(String pvOtherNameSuffixText) {
		this.pvOtherNameSuffixText = pvOtherNameSuffixText;
	}

	public String getPvOtherCredentialText() {
		return pvOtherCredentialText;
	}

	public void setPvOtherCredentialText(String pvOtherCredentialText) {
		this.pvOtherCredentialText = pvOtherCredentialText;
	}

	public String getPvOtherLastNameTypeCode() {
		return pvOtherLastNameTypeCode;
	}

	public void setPvOtherLastNameTypeCode(String pvOtherLastNameTypeCode) {
		this.pvOtherLastNameTypeCode = pvOtherLastNameTypeCode;
	}

	public String getPvFirstLineBusinessMailingAddress() {
		return pvFirstLineBusinessMailingAddress;
	}

	public void setPvFirstLineBusinessMailingAddress(String pvFirstLineBusinessMailingAddress) {
		this.pvFirstLineBusinessMailingAddress = pvFirstLineBusinessMailingAddress;
	}

	public String getPvSecondLineBusinessMailingAddress() {
		return pvSecondLineBusinessMailingAddress;
	}

	public void setPvSecondLineBusinessMailingAddress(String pvSecondLineBusinessMailingAddress) {
		this.pvSecondLineBusinessMailingAddress = pvSecondLineBusinessMailingAddress;
	}

	public String getPvBusinessMailingAddressCityName() {
		return pvBusinessMailingAddressCityName;
	}

	public void setPvBusinessMailingAddressCityName(String pvBusinessMailingAddressCityName) {
		this.pvBusinessMailingAddressCityName = pvBusinessMailingAddressCityName;
	}

	public String getPvBusinessMailingAddressStateName() {
		return pvBusinessMailingAddressStateName;
	}

	public void setPvBusinessMailingAddressStateName(String pvBusinessMailingAddressStateName) {
		this.pvBusinessMailingAddressStateName = pvBusinessMailingAddressStateName;
	}

	public String getPvBusinessMailingAddressPostalCode() {
		return pvBusinessMailingAddressPostalCode;
	}

	public void setPvBusinessMailingAddressPostalCode(String pvBusinessMailingAddressPostalCode) {
		this.pvBusinessMailingAddressPostalCode = pvBusinessMailingAddressPostalCode;
	}

	public String getPvBusinessMailingAddressCountryCode() {
		return pvBusinessMailingAddressCountryCode;
	}

	public void setPvBusinessMailingAddressCountryCode(String pvBusinessMailingAddressCountryCode) {
		this.pvBusinessMailingAddressCountryCode = pvBusinessMailingAddressCountryCode;
	}

	public String getPvBusinessMailingAddressTelephoneNumber() {
		return pvBusinessMailingAddressTelephoneNumber;
	}

	public void setPvBusinessMailingAddressTelephoneNumber(String pvBusinessMailingAddressTelephoneNumber) {
		this.pvBusinessMailingAddressTelephoneNumber = pvBusinessMailingAddressTelephoneNumber;
	}

	public String getPvBusinessMailingAddressFaxNumber() {
		return pvBusinessMailingAddressFaxNumber;
	}

	public void setPvBusinessMailingAddressFaxNumber(String pvBusinessMailingAddressFaxNumber) {
		this.pvBusinessMailingAddressFaxNumber = pvBusinessMailingAddressFaxNumber;
	}

	public String getPvFirstLineBusinessPracticeLocationAddress() {
		return pvFirstLineBusinessPracticeLocationAddress;
	}

	public void setPvFirstLineBusinessPracticeLocationAddress(String pvFirstLineBusinessPracticeLocationAddress) {
		this.pvFirstLineBusinessPracticeLocationAddress = pvFirstLineBusinessPracticeLocationAddress;
	}

	public String getPvSecondLineBusinessPracticeLocationAddress() {
		return pvSecondLineBusinessPracticeLocationAddress;
	}

	public void setPvSecondLineBusinessPracticeLocationAddress(String pvSecondLineBusinessPracticeLocationAddress) {
		this.pvSecondLineBusinessPracticeLocationAddress = pvSecondLineBusinessPracticeLocationAddress;
	}

	public String getPvBusinessPracticeLocationAddressCityName() {
		return pvBusinessPracticeLocationAddressCityName;
	}

	public void setPvBusinessPracticeLocationAddressCityName(String pvBusinessPracticeLocationAddressCityName) {
		this.pvBusinessPracticeLocationAddressCityName = pvBusinessPracticeLocationAddressCityName;
	}

	public String getPvBusinessPracticeLocationAddressStateName() {
		return pvBusinessPracticeLocationAddressStateName;
	}

	public void setPvBusinessPracticeLocationAddressStateName(String pvBusinessPracticeLocationAddressStateName) {
		this.pvBusinessPracticeLocationAddressStateName = pvBusinessPracticeLocationAddressStateName;
	}

	public String getPvBusinessPracticeLocationAddressPostalCode() {
		return pvBusinessPracticeLocationAddressPostalCode;
	}

	public void setPvBusinessPracticeLocationAddressPostalCode(String pvBusinessPracticeLocationAddressPostalCode) {
		this.pvBusinessPracticeLocationAddressPostalCode = pvBusinessPracticeLocationAddressPostalCode;
	}

	public String getPvBusinessPracticeLocationAddressCountryCode() {
		return pvBusinessPracticeLocationAddressCountryCode;
	}

	public void setPvBusinessPracticeLocationAddressCountryCode(String pvBusinessPracticeLocationAddressCountryCode) {
		this.pvBusinessPracticeLocationAddressCountryCode = pvBusinessPracticeLocationAddressCountryCode;
	}

	public String getPvBusinessPracticeLocationAddressTelephoneNumber() {
		return pvBusinessPracticeLocationAddressTelephoneNumber;
	}

	public void setPvBusinessPracticeLocationAddressTelephoneNumber(
			String pvBusinessPracticeLocationAddressTelephoneNumber) {
		this.pvBusinessPracticeLocationAddressTelephoneNumber = pvBusinessPracticeLocationAddressTelephoneNumber;
	}

	public String getPvBusinessPracticeLocationAddressFaxNumber() {
		return pvBusinessPracticeLocationAddressFaxNumber;
	}

	public void setPvBusinessPracticeLocationAddressFaxNumber(String pvBusinessPracticeLocationAddressFaxNumber) {
		this.pvBusinessPracticeLocationAddressFaxNumber = pvBusinessPracticeLocationAddressFaxNumber;
	}

	public String getPvEnumerationDate() {
		return pvEnumerationDate;
	}

	public void setPvEnumerationDate(String pvEnumerationDate) {
		this.pvEnumerationDate = pvEnumerationDate;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getnPIDeactivationReasonCode() {
		return nPIDeactivationReasonCode;
	}

	public void setnPIDeactivationReasonCode(String nPIDeactivationReasonCode) {
		this.nPIDeactivationReasonCode = nPIDeactivationReasonCode;
	}

	public String getnPIDeactivationDate() {
		return nPIDeactivationDate;
	}

	public void setnPIDeactivationDate(String nPIDeactivationDate) {
		this.nPIDeactivationDate = nPIDeactivationDate;
	}

	public String getnPIReactivationDate() {
		return nPIReactivationDate;
	}

	public void setnPIReactivationDate(String nPIReactivationDate) {
		this.nPIReactivationDate = nPIReactivationDate;
	}

	public String getPvGenderCode() {
		return pvGenderCode;
	}

	public void setPvGenderCode(String pvGenderCode) {
		this.pvGenderCode = pvGenderCode;
	}

	public String getAuthorizedOfficialLastName() {
		return authorizedOfficialLastName;
	}

	public void setAuthorizedOfficialLastName(String authorizedOfficialLastName) {
		this.authorizedOfficialLastName = authorizedOfficialLastName;
	}

	public String getAuthorizedOfficialFirstName() {
		return authorizedOfficialFirstName;
	}

	public void setAuthorizedOfficialFirstName(String authorizedOfficialFirstName) {
		this.authorizedOfficialFirstName = authorizedOfficialFirstName;
	}

	public String getAuthorizedOfficialMiddleName() {
		return authorizedOfficialMiddleName;
	}

	public void setAuthorizedOfficialMiddleName(String authorizedOfficialMiddleName) {
		this.authorizedOfficialMiddleName = authorizedOfficialMiddleName;
	}

	public String getAuthorizedOfficialTitleorPosition() {
		return authorizedOfficialTitleorPosition;
	}

	public void setAuthorizedOfficialTitleorPosition(String authorizedOfficialTitleorPosition) {
		this.authorizedOfficialTitleorPosition = authorizedOfficialTitleorPosition;
	}

	public String getAuthorizedOfficialTelephoneNumber() {
		return authorizedOfficialTelephoneNumber;
	}

	public void setAuthorizedOfficialTelephoneNumber(String authorizedOfficialTelephoneNumber) {
		this.authorizedOfficialTelephoneNumber = authorizedOfficialTelephoneNumber;
	}

	public String getHealthcareProviderTaxonomyCode_1() {
		return healthcareProviderTaxonomyCode_1;
	}

	public void setHealthcareProviderTaxonomyCode_1(String healthcareProviderTaxonomyCode_1) {
		this.healthcareProviderTaxonomyCode_1 = healthcareProviderTaxonomyCode_1;
	}

	public String getProviderLicenseNumber_1() {
		return providerLicenseNumber_1;
	}

	public void setProviderLicenseNumber_1(String providerLicenseNumber_1) {
		this.providerLicenseNumber_1 = providerLicenseNumber_1;
	}

	public String getProviderLicenseNumberStateCode_1() {
		return providerLicenseNumberStateCode_1;
	}

	public void setProviderLicenseNumberStateCode_1(String providerLicenseNumberStateCode_1) {
		this.providerLicenseNumberStateCode_1 = providerLicenseNumberStateCode_1;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_1() {
		return healthcareProviderPrimaryTaxonomySwitch_1;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_1(String healthcareProviderPrimaryTaxonomySwitch_1) {
		this.healthcareProviderPrimaryTaxonomySwitch_1 = healthcareProviderPrimaryTaxonomySwitch_1;
	}

	public String getHealthcareProviderTaxonomyCode_2() {
		return healthcareProviderTaxonomyCode_2;
	}

	public void setHealthcareProviderTaxonomyCode_2(String healthcareProviderTaxonomyCode_2) {
		this.healthcareProviderTaxonomyCode_2 = healthcareProviderTaxonomyCode_2;
	}

	public String getProviderLicenseNumber_2() {
		return providerLicenseNumber_2;
	}

	public void setProviderLicenseNumber_2(String providerLicenseNumber_2) {
		this.providerLicenseNumber_2 = providerLicenseNumber_2;
	}

	public String getProviderLicenseNumberStateCode_2() {
		return providerLicenseNumberStateCode_2;
	}

	public void setProviderLicenseNumberStateCode_2(String providerLicenseNumberStateCode_2) {
		this.providerLicenseNumberStateCode_2 = providerLicenseNumberStateCode_2;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_2() {
		return healthcareProviderPrimaryTaxonomySwitch_2;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_2(String healthcareProviderPrimaryTaxonomySwitch_2) {
		this.healthcareProviderPrimaryTaxonomySwitch_2 = healthcareProviderPrimaryTaxonomySwitch_2;
	}

	public String getHealthcareProviderTaxonomyCode_3() {
		return healthcareProviderTaxonomyCode_3;
	}

	public void setHealthcareProviderTaxonomyCode_3(String healthcareProviderTaxonomyCode_3) {
		this.healthcareProviderTaxonomyCode_3 = healthcareProviderTaxonomyCode_3;
	}

	public String getProviderLicenseNumber_3() {
		return providerLicenseNumber_3;
	}

	public void setProviderLicenseNumber_3(String providerLicenseNumber_3) {
		this.providerLicenseNumber_3 = providerLicenseNumber_3;
	}

	public String getProviderLicenseNumberStateCode_3() {
		return providerLicenseNumberStateCode_3;
	}

	public void setProviderLicenseNumberStateCode_3(String providerLicenseNumberStateCode_3) {
		this.providerLicenseNumberStateCode_3 = providerLicenseNumberStateCode_3;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_3() {
		return healthcareProviderPrimaryTaxonomySwitch_3;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_3(String healthcareProviderPrimaryTaxonomySwitch_3) {
		this.healthcareProviderPrimaryTaxonomySwitch_3 = healthcareProviderPrimaryTaxonomySwitch_3;
	}

	public String getHealthcareProviderTaxonomyCode_4() {
		return healthcareProviderTaxonomyCode_4;
	}

	public void setHealthcareProviderTaxonomyCode_4(String healthcareProviderTaxonomyCode_4) {
		this.healthcareProviderTaxonomyCode_4 = healthcareProviderTaxonomyCode_4;
	}

	public String getProviderLicenseNumber_4() {
		return providerLicenseNumber_4;
	}

	public void setProviderLicenseNumber_4(String providerLicenseNumber_4) {
		this.providerLicenseNumber_4 = providerLicenseNumber_4;
	}

	public String getProviderLicenseNumberStateCode_4() {
		return providerLicenseNumberStateCode_4;
	}

	public void setProviderLicenseNumberStateCode_4(String providerLicenseNumberStateCode_4) {
		this.providerLicenseNumberStateCode_4 = providerLicenseNumberStateCode_4;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_4() {
		return healthcareProviderPrimaryTaxonomySwitch_4;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_4(String healthcareProviderPrimaryTaxonomySwitch_4) {
		this.healthcareProviderPrimaryTaxonomySwitch_4 = healthcareProviderPrimaryTaxonomySwitch_4;
	}

	public String getHealthcareProviderTaxonomyCode_5() {
		return healthcareProviderTaxonomyCode_5;
	}

	public void setHealthcareProviderTaxonomyCode_5(String healthcareProviderTaxonomyCode_5) {
		this.healthcareProviderTaxonomyCode_5 = healthcareProviderTaxonomyCode_5;
	}

	public String getProviderLicenseNumber_5() {
		return providerLicenseNumber_5;
	}

	public void setProviderLicenseNumber_5(String providerLicenseNumber_5) {
		this.providerLicenseNumber_5 = providerLicenseNumber_5;
	}

	public String getProviderLicenseNumberStateCode_5() {
		return providerLicenseNumberStateCode_5;
	}

	public void setProviderLicenseNumberStateCode_5(String providerLicenseNumberStateCode_5) {
		this.providerLicenseNumberStateCode_5 = providerLicenseNumberStateCode_5;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_5() {
		return healthcareProviderPrimaryTaxonomySwitch_5;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_5(String healthcareProviderPrimaryTaxonomySwitch_5) {
		this.healthcareProviderPrimaryTaxonomySwitch_5 = healthcareProviderPrimaryTaxonomySwitch_5;
	}

	public String getHealthcareProviderTaxonomyCode_6() {
		return healthcareProviderTaxonomyCode_6;
	}

	public void setHealthcareProviderTaxonomyCode_6(String healthcareProviderTaxonomyCode_6) {
		this.healthcareProviderTaxonomyCode_6 = healthcareProviderTaxonomyCode_6;
	}

	public String getProviderLicenseNumber_6() {
		return providerLicenseNumber_6;
	}

	public void setProviderLicenseNumber_6(String providerLicenseNumber_6) {
		this.providerLicenseNumber_6 = providerLicenseNumber_6;
	}

	public String getProviderLicenseNumberStateCode_6() {
		return providerLicenseNumberStateCode_6;
	}

	public void setProviderLicenseNumberStateCode_6(String providerLicenseNumberStateCode_6) {
		this.providerLicenseNumberStateCode_6 = providerLicenseNumberStateCode_6;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_6() {
		return healthcareProviderPrimaryTaxonomySwitch_6;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_6(String healthcareProviderPrimaryTaxonomySwitch_6) {
		this.healthcareProviderPrimaryTaxonomySwitch_6 = healthcareProviderPrimaryTaxonomySwitch_6;
	}

	public String getHealthcareProviderTaxonomyCode_7() {
		return healthcareProviderTaxonomyCode_7;
	}

	public void setHealthcareProviderTaxonomyCode_7(String healthcareProviderTaxonomyCode_7) {
		this.healthcareProviderTaxonomyCode_7 = healthcareProviderTaxonomyCode_7;
	}

	public String getProviderLicenseNumber_7() {
		return providerLicenseNumber_7;
	}

	public void setProviderLicenseNumber_7(String providerLicenseNumber_7) {
		this.providerLicenseNumber_7 = providerLicenseNumber_7;
	}

	public String getProviderLicenseNumberStateCode_7() {
		return providerLicenseNumberStateCode_7;
	}

	public void setProviderLicenseNumberStateCode_7(String providerLicenseNumberStateCode_7) {
		this.providerLicenseNumberStateCode_7 = providerLicenseNumberStateCode_7;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_7() {
		return healthcareProviderPrimaryTaxonomySwitch_7;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_7(String healthcareProviderPrimaryTaxonomySwitch_7) {
		this.healthcareProviderPrimaryTaxonomySwitch_7 = healthcareProviderPrimaryTaxonomySwitch_7;
	}

	public String getHealthcareProviderTaxonomyCode_8() {
		return healthcareProviderTaxonomyCode_8;
	}

	public void setHealthcareProviderTaxonomyCode_8(String healthcareProviderTaxonomyCode_8) {
		this.healthcareProviderTaxonomyCode_8 = healthcareProviderTaxonomyCode_8;
	}

	public String getProviderLicenseNumber_8() {
		return providerLicenseNumber_8;
	}

	public void setProviderLicenseNumber_8(String providerLicenseNumber_8) {
		this.providerLicenseNumber_8 = providerLicenseNumber_8;
	}

	public String getProviderLicenseNumberStateCode_8() {
		return providerLicenseNumberStateCode_8;
	}

	public void setProviderLicenseNumberStateCode_8(String providerLicenseNumberStateCode_8) {
		this.providerLicenseNumberStateCode_8 = providerLicenseNumberStateCode_8;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_8() {
		return healthcareProviderPrimaryTaxonomySwitch_8;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_8(String healthcareProviderPrimaryTaxonomySwitch_8) {
		this.healthcareProviderPrimaryTaxonomySwitch_8 = healthcareProviderPrimaryTaxonomySwitch_8;
	}

	public String getHealthcareProviderTaxonomyCode_9() {
		return healthcareProviderTaxonomyCode_9;
	}

	public void setHealthcareProviderTaxonomyCode_9(String healthcareProviderTaxonomyCode_9) {
		this.healthcareProviderTaxonomyCode_9 = healthcareProviderTaxonomyCode_9;
	}

	public String getProviderLicenseNumber_9() {
		return providerLicenseNumber_9;
	}

	public void setProviderLicenseNumber_9(String providerLicenseNumber_9) {
		this.providerLicenseNumber_9 = providerLicenseNumber_9;
	}

	public String getProviderLicenseNumberStateCode_9() {
		return providerLicenseNumberStateCode_9;
	}

	public void setProviderLicenseNumberStateCode_9(String providerLicenseNumberStateCode_9) {
		this.providerLicenseNumberStateCode_9 = providerLicenseNumberStateCode_9;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_9() {
		return healthcareProviderPrimaryTaxonomySwitch_9;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_9(String healthcareProviderPrimaryTaxonomySwitch_9) {
		this.healthcareProviderPrimaryTaxonomySwitch_9 = healthcareProviderPrimaryTaxonomySwitch_9;
	}

	public String getHealthcareProviderTaxonomyCode_10() {
		return healthcareProviderTaxonomyCode_10;
	}

	public void setHealthcareProviderTaxonomyCode_10(String healthcareProviderTaxonomyCode_10) {
		this.healthcareProviderTaxonomyCode_10 = healthcareProviderTaxonomyCode_10;
	}

	public String getProviderLicenseNumber_10() {
		return providerLicenseNumber_10;
	}

	public void setProviderLicenseNumber_10(String providerLicenseNumber_10) {
		this.providerLicenseNumber_10 = providerLicenseNumber_10;
	}

	public String getProviderLicenseNumberStateCode_10() {
		return providerLicenseNumberStateCode_10;
	}

	public void setProviderLicenseNumberStateCode_10(String providerLicenseNumberStateCode_10) {
		this.providerLicenseNumberStateCode_10 = providerLicenseNumberStateCode_10;
	}

	public String getHealthcareProviderPrimaryTaxonomySwitch_10() {
		return healthcareProviderPrimaryTaxonomySwitch_10;
	}

	public void setHealthcareProviderPrimaryTaxonomySwitch_10(String healthcareProviderPrimaryTaxonomySwitch_10) {
		this.healthcareProviderPrimaryTaxonomySwitch_10 = healthcareProviderPrimaryTaxonomySwitch_10;
	}

	public String getIsSoleProprietor() {
		return isSoleProprietor;
	}

	public void setIsSoleProprietor(String isSoleProprietor) {
		this.isSoleProprietor = isSoleProprietor;
	}

	public String getIsOrganizationSubpart() {
		return isOrganizationSubpart;
	}

	public void setIsOrganizationSubpart(String isOrganizationSubpart) {
		this.isOrganizationSubpart = isOrganizationSubpart;
	}

	public String getParentOrganizationLBN() {
		return parentOrganizationLBN;
	}

	public void setParentOrganizationLBN(String parentOrganizationLBN) {
		this.parentOrganizationLBN = parentOrganizationLBN;
	}

	public String getParentOrganizationTIN() {
		return parentOrganizationTIN;
	}

	public void setParentOrganizationTIN(String parentOrganizationTIN) {
		this.parentOrganizationTIN = parentOrganizationTIN;
	}

	public String getAuthorizedOfficialNamePrefixText() {
		return authorizedOfficialNamePrefixText;
	}

	public void setAuthorizedOfficialNamePrefixText(String authorizedOfficialNamePrefixText) {
		this.authorizedOfficialNamePrefixText = authorizedOfficialNamePrefixText;
	}

	public String getAuthorizedOfficialNameSuffixText() {
		return authorizedOfficialNameSuffixText;
	}

	public void setAuthorizedOfficialNameSuffixText(String authorizedOfficialNameSuffixText) {
		this.authorizedOfficialNameSuffixText = authorizedOfficialNameSuffixText;
	}

	public String getAuthorizedOfficialCredentialText() {
		return authorizedOfficialCredentialText;
	}

	public void setAuthorizedOfficialCredentialText(String authorizedOfficialCredentialText) {
		this.authorizedOfficialCredentialText = authorizedOfficialCredentialText;
	}

}
