package com.poonam.test;

import java.util.Date;

import com.poonam.dto.CustomerDto;
import com.poonam.model.CustomerModel;

public class Test {

	
	public static void main(String[] args) {
		
		CustomerDto dto=new CustomerDto();
		dto.setId(1);
		dto.setName("Danish Ahmed");
		dto.setAddress("142, Azad Nagar Indore");
		dto.setBillDate(new Date());
		dto.setBillTotal(10900);
		dto.setAmountPaid(10000);
		dto.setMobNo("9039373098");	
	
		CustomerModel model=new CustomerModel();
		model.add(dto);
		
	}
}
