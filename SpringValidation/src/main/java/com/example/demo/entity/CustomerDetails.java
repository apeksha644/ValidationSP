package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Table
@SqlResultSetMapping(name = "CustomerMaster" , classes = @ConstructorResult(targetClass = CustomerDetails.class ,columns = {
		@ColumnResult(name = "CustGuId"  , type = String.class),
		@ColumnResult(name = "FirstName" , type = String.class),
		@ColumnResult(name = "MiddleName" , type = String.class),	
		@ColumnResult(name = "LastName" , type = String.class),		
		@ColumnResult(name = "Gender" , type = String.class),
		@ColumnResult(name = "DateOfBirth" , type = String.class),
		@ColumnResult(name = "EmailId" , type = String.class),
		@ColumnResult(name = "MobileNo" , type = String.class),
		@ColumnResult(name = "AddressLine1" , type = String.class),
		@ColumnResult(name = "AddressLine2" , type = String.class),
		@ColumnResult(name = "AddressLine3" , type = String.class),
		@ColumnResult(name = "Pincode" , type = String.class),
		@ColumnResult(name = "CountryGuId" , type = String.class),
		@ColumnResult(name = "CityGuId" , type = String.class),
		@ColumnResult(name = "StateGuId" , type = String.class),
		@ColumnResult(name = "AddressType" , type = String.class),
		@ColumnResult(name = "SalutationGuId"  , type = String.class),
		@ColumnResult(name = "Language" , type = String.class),
				
}))
public class CustomerDetails {
	
	
	@Size(message = "id contain only string")
	private String CustGuId;
	
	@Size(message = "name contain 4 character")
	private String FirstName;
	
	@Size(message = "name contain 4 character")
	private String MiddleName;
	@Size(message = "name contain 4 character")
	private String LastName;
	@Size(message = "id contain only string")
	private String Gender;
	@Size(message = "proper format")
	private String DateOfBirth;
	
	@Email
	private String EmailId;
	@Size(message = "i10 digit mobile no")
	private String MobileNo;
	@Size(min=10)
	private String AddressLine1;
	@Size(message = "id contain only string")
	private String AddressLine2;
	@Size(message = "id contain only string")
	private String AddressLine3;
	@Size(message = "id contain only string")
	private String Pincode;
	@Size(message = "id contain only string")
	private String CountryGuId;
	@Size(message = "id contain only string")
	private String CityGuId;
	@Size(message = "id contain only string")
	private String StateGuId;
	@Size(message = "id contain only string")
	private String AddressType;
	@Size(message = "id contain only string")
	private String SalutationGuId;
	@Size(message = "lanuage is complusory")
	private String Language;
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(String custGuId, String firstName, String middleName, String lastName, String gender,
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
