package com.example.demo.service;

import java.util.List;



import com.example.demo.entity.Business;
import com.example.demo.requestDto.businessrequestdto;
import com.example.demo.responseDto.businessresponsedto;

public interface BusinessService {
	public Business save(businessrequestdto dto);
	public businessresponsedto getById(Long id);
	public List< businessresponsedto> findAll();

}
