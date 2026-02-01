package com.example.demo.service;

import java.util.List;

import com.example.demo.requestDto.productrequestdto;
import com.example.demo.responseDto.productresponsedto;

public interface productservice {
	public productresponsedto save(productrequestdto dt);
	public List<productresponsedto> get();
	public productresponsedto getAll(Long id);
	public productresponsedto update(Long id,productrequestdto dt);
    public String delete(Long id);
}
