package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.product;
import com.example.demo.mapping.ProductMapper;
import com.example.demo.repository.productrepository;
import com.example.demo.requestDto.productrequestdto;
import com.example.demo.responseDto.productresponsedto;
@Service
public class productserviceimplement implements productservice{
@Autowired
private productrepository pr;
	@Override
	public productresponsedto save(productrequestdto dt) {
		product entity = ProductMapper.converttoEntity(dt);
		product saved = pr.save(entity);
		productresponsedto response = ProductMapper.converttodto(saved);
		return response;


		
	}

	@Override
	public List<productresponsedto> get() {
		// TODO Auto-generated method stub
		List<product> list= pr.findAll();
		List<productresponsedto> result=new ArrayList<>();
		for(product p :list) {
			result.add(ProductMapper.converttodto(p));
		}
		return result;
	}

	@Override
	public productresponsedto getAll(Long id) {
		// TODO Auto-generated method stub
		Optional<product> byId = pr.findById(id);
		
		
		return  ProductMapper.converttodto(byId.get());
	}

	@Override
	public productresponsedto update(Long id, productrequestdto dt) {
		// TODO Auto-generated method stub
		Optional<product> byId = pr.findById(id);
		product p=byId.get();
		if(dt.getGstPercentage()!=null) {
			p.setGstPercentage(dt.getGstPercentage());
		}
		if(dt.getPrice()!=null) {
			p.setPrice(dt.getPrice());
		}
		if(dt.getProductName()!=null) {
			p.setProductName(dt.getProductName());
		}
		pr.save(p);
		return ProductMapper.converttodto(p);
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
		return "Delete data";
	}

}
