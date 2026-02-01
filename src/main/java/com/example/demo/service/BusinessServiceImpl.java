package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Business;
import com.example.demo.mapping.businessmapper;
import com.example.demo.repository.businessrepository;
import com.example.demo.requestDto.businessrequestdto;
import com.example.demo.responseDto.businessresponsedto;
@Service
public class BusinessServiceImpl implements BusinessService{
 @Autowired
 public businessrepository repo;
 
	@Override
	public Business save(businessrequestdto dto) {
		return repo.save(businessmapper.converttoEntity(dto));
	}

	@Override
	public businessresponsedto getById(Long id) {
		// TODO Auto-generated method stub
		Optional<Business> byId = repo.findById(id);
		businessresponsedto dto=businessmapper.converttodto(byId.get());
		return dto;
	}

	@Override
	public List<businessresponsedto> findAll() {
		// TODO Auto-generated method stub
		List<Business> list = repo.findAll();
		List<businessresponsedto> dlist=new ArrayList<>();
		for(Business b:list) {
			dlist.add(businessmapper.converttodto(b));
			
		}
		return dlist;
	}

}
