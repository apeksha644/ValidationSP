package com.example.demo.responseModel;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.entity.CustomerMaster;

public class CustomerMasterDetailsResponse {
	
	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private CustomerMaster customerMaster;
	public CustomerMasterDetailsResponse(int i, int j, String string, String string2, CustomerDetails customerDetails) {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerMasterDetailsResponse(int status, int errorCode, String messageType, String message,
			CustomerMaster customerMaster) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		this.customerMaster = customerMaster;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public CustomerMaster getCustomerMaster() {
		return customerMaster;
	}
	public void setCustomerMaster(CustomerMaster customerMaster) {
		this.customerMaster = customerMaster;
	}
	

	
	

}
