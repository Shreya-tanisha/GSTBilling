package com.example.demo.mapping;

import com.example.demo.entity.Business;
import com.example.demo.requestDto.businessrequestdto;
import com.example.demo.responseDto.businessresponsedto;

public class businessmapper {
	public static Business converttoEntity(businessrequestdto br) {
		Business b=new Business();
		b.setBusinessName(br.getBusinessName());
		b.setPhone(br.getPhone());
		b.setGstNumber(br.getGstNumber());
		b.setPraddress(br.getPraddress());
		b.setState(br.getState());
		b.setCreateAt(br.getCreateAt());
		return b;
		
	}
	public static businessresponsedto converttodto(Business b) {
		businessresponsedto dto=new businessresponsedto();
		dto.setBusinessName(b.getBusinessName());
		dto.setPhone(b.getPhone());
		dto.setGstNumber(b.getGstNumber());
		dto.setPraddress(b.getPraddress());
		dto.setState(b.getState());
		dto.setCreateAt(b.getCreateAt());
		return dto;
		
	}
	

}
