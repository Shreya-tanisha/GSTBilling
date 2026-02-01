package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Business;
import com.example.demo.requestDto.businessrequestdto;
import com.example.demo.responseDto.businessresponsedto;
import com.example.demo.service.BusinessService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class businesscontroller {
	@Autowired
	 BusinessService bs;
	@PostMapping("/business")
	public ResponseEntity<Business> save(@RequestBody @Valid businessrequestdto dto){
		Business save = bs.save(dto);
		return ResponseEntity.ok(save);
		
	}
	@GetMapping("/business/{id}")
	public ResponseEntity<businessresponsedto> getbyid(@PathVariable long id){
		businessresponsedto id2 = bs.getById(id);
		return  ResponseEntity.ok(id2);
		
	}
	
	@GetMapping("/business")
	public ResponseEntity<List<businessresponsedto>> getAllid(@PathVariable long id){
	List<businessresponsedto> all = bs.findAll();
	return ResponseEntity.ok(all);
		
	}
	

}
