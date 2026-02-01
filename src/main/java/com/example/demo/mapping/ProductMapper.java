package com.example.demo.mapping;

import com.example.demo.entity.product;
import com.example.demo.exception.GSTPercentageNotAllowedException;
import com.example.demo.requestDto.productrequestdto;
import com.example.demo.responseDto.productresponsedto;
import com.example.demo.util.Allowed_Gst;

public class ProductMapper {
	
	public static product converttoEntity(productrequestdto dt) {
		product p=new product();
		p.setCreatedAt(dt.getCreatedAt());
		p.setPrice(dt.getPrice());
		p.setProductName(dt.getProductName());
		Double per=dt.getGstPercentage();
		if(Allowed_Gst.ALLOWED_GST.contains(per)) {
			p.setGstPercentage(per);
		}else {
			throw new GSTPercentageNotAllowedException("Gst is not found");
		}
		return p;
		
	}
	public static productresponsedto converttodto(product p) {
		productresponsedto dto=new productresponsedto();
		dto.setPrice(p.getPrice());
		dto.setCreatedAt(p.getCreatedAt());
		dto.setGstPercentage(p.getGstPercentage());
		dto.setProductName(p.getProductName());
		dto.setId(p.getId());
		return dto;
		
	}

}
