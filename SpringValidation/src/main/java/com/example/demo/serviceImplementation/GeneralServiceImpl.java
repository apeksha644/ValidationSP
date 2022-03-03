package com.example.demo.serviceImplementation;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.GeneralDaoLayer;
import com.example.demo.entity.CustomerDetails;
import com.example.demo.entity.CustomerMaster;
import com.example.demo.responseModel.CustomerMasterDetailsResponse;

@Service
public class GeneralServiceImpl implements GeneralServiceLayer {

	@Autowired
	private GeneralDaoLayer generalDaoLayer;
	
	


	@Override
	public CustomerMasterDetailsResponse updateCustomerDetails(CustomerMaster custDetails) {
		// TODO Auto-generated method stub
		List<CustomerDetails> list = generalDaoLayer.UpdateCustomerDetail(custDetails);
		//CustomerDetails customerDetails = list != null && list.size() > 0 ? list.get(0) : null;
		CustomerMasterDetailsResponse response  = new CustomerMasterDetailsResponse(1 ,0 , "I" , "Success" , list.get(0));
		return response;
	}





	

}
