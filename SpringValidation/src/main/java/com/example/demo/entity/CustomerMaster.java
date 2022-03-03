package com.example.demo.entity;

public class CustomerMaster {
	
	private String CustGuId;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String Gender;
	private String DateOfBirth;
	private String EmailId;
	private String MobileNo;
	private String AddressLine1;
	private String AddressLine2;
	private String AddressLine3;
	private String Pincode;
	private String CountryGuId;
	private String CityGuId;
	private String StateGuId;
	private String AddressType;
	private String SalutationGuId;
	private String Language;
	public CustomerMaster(String custGuId, String firstName, String middleName, String lastName, String gender,
			String dateOfBirth, String emailId, String mobileNo, String addressLine1, String addressLine2,
			String addressLine3, String pincode, String countryGuId, String cityGuId, String stateGuId,
			String addressType, String salutationGuId, String language) {
		super();
		CustGuId = custGuId;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		EmailId = emailId;
		MobileNo = mobileNo;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		AddressLine3 = addressLine3;
		Pincode = pincode;
		CountryGuId = countryGuId;
		CityGuId = cityGuId;
		StateGuId = stateGuId;
		AddressType = addressType;
		SalutationGuId = salutationGuId;
		Language = language;
	}
	public String getCustGuId() {
		return CustGuId;
	}
	public void setCustGuId(String custGuId) {
		CustGuId = custGuId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return AddressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		AddressLine3 = addressLine3;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getCountryGuId() {
		return CountryGuId;
	}
	public void setCountryGuId(String countryGuId) {
		CountryGuId = countryGuId;
	}
	public String getCityGuId() {
		return CityGuId;
	}
	public void setCityGuId(String cityGuId) {
		CityGuId = cityGuId;
	}
	public String getStateGuId() {
		return StateGuId;
	}
	public void setStateGuId(String stateGuId) {
		StateGuId = stateGuId;
	}
	public String getAddressType() {
		return AddressType;
	}
	public void setAddressType(String addressType) {
		AddressType = addressType;
	}
	public String getSalutationGuId() {
		return SalutationGuId;
	}
	public void setSalutationGuId(String salutationGuId) {
		SalutationGuId = salutationGuId;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	
	
	
}
