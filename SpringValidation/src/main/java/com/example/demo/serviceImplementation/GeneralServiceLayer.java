package com.example.demo.serviceImplementation;

import javax.validation.Valid;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.entity.CustomerMaster;
import com.example.demo.responseModel.CustomerMasterDetailsResponse;

public interface GeneralServiceLayer {

	


  public CustomerMasterDetailsResponse updateCustomerDetails( @Valid CustomerMaster custMaster);

//CustomerMasterDetailsResponse updateCustomerDetails(@Valid CustomerDetails custMaster);
	


}
