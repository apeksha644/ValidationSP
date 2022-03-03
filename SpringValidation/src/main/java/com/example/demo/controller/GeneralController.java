package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerMaster;
import com.example.demo.entity.CustomerDetails;

import com.example.demo.responseModel.CustomerMasterDetailsResponse;
import com.example.demo.serviceImplementation.GeneralServiceLayer;



@RestController
@RequestMapping("/api/v1")
public class GeneralController {

	@Autowired
	private GeneralServiceLayer generalServiceLayer;
	
	@PostMapping("/UpdateCustomerDetails")
	public CustomerMasterDetailsResponse updateCustomerDetails(@Valid @RequestBody CustomerMaster custMaster)
	{
		return this.generalServiceLayer.updateCustomerDetails(custMaster);
	 
		
		
	}

}
