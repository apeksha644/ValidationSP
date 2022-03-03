package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.entity.CustomerMaster;


@Repository
public class GeneralDaoLayer {
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<CustomerDetails> UpdateCustomerDetail(CustomerMaster cust1) {
		
		
		
			StoredProcedureQuery query = em.createStoredProcedureQuery("UpdateCustomerDetail")
					.registerStoredProcedureParameter("CustGuId", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("FirstName", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("MiddleName", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("LastName", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("Gender", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("DateOfBirth", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("EmailId", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("MobileNo", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("AddressLine1", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("AddressLine2", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("AddressLine3", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("Pincode", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("CountryGuId", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("CityGuId", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("StateGuId", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("AddressType", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("SalutationGuId", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("Language", String.class, ParameterMode.IN)
					
					
					.setParameter("CustGuId", cust1.getCustGuId())
					.setParameter("FirstName", cust1.getFirstName())
					.setParameter("MiddleName", cust1.getMiddleName())
					.setParameter("LastName", cust1.getLastName())
					.setParameter("Gender", cust1.getGender())
					.setParameter("DateOfBirth", cust1.getDateOfBirth())
					.setParameter("EmailId", cust1.getEmailId())
					.setParameter("MobileNo", cust1.getMobileNo())
					.setParameter("AddressLine1", cust1.getAddressLine1())
					.setParameter("AddressLine2", cust1.getAddressLine2())
					.setParameter("AddressLine3", cust1.getAddressLine3())
					.setParameter("Pincode", cust1.getPincode())	
					.setParameter("CountryGuId", cust1.getCountryGuId())
					.setParameter("CityGuId", cust1.getCityGuId())
					.setParameter("StateGuId", cust1.getStateGuId())
					.setParameter("AddressType", cust1.getAddressType())
					.setParameter("SalutationGuId", cust1.getAddressType())
					.setParameter("Language", cust1.getAddressType());
					
					
					query.execute();
					
					return query.getResultList();
				
			
	}	

}
