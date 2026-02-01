package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.requestDto.productrequestdto;
import com.example.demo.responseDto.productresponsedto;
import com.example.demo.service.productserviceimplement;
@RestController
@RequestMapping("/api")
public class productController {
	@Autowired
	productserviceimplement ps;
	@PostMapping("/product")
	public ResponseEntity<productresponsedto> save(@RequestBody productrequestdto dt){
		productresponsedto save = ps.save(dt);
		return ResponseEntity.ok(save);
		
	}
	@GetMapping("/product")
	public ResponseEntity<List<productresponsedto>> get(){
		List<productresponsedto> list = ps.get();
		if(list.isEmpty()) {
			return ResponseEntity.noContent().build();
			
		}
		return ResponseEntity.ok(list);
	}
	@GetMapping("/product/{id}")
	public  ResponseEntity<productresponsedto> get(@PathVariable Long id){
	    productresponsedto all = ps.getAll(id);
		
		return ResponseEntity.ok(all);
	}
	@PostMapping("/product/{id}")
	public  ResponseEntity<productresponsedto> update(@PathVariable Long id,@RequestBody productrequestdto dt ){
	     productresponsedto update = ps.update(id, dt);
		
		return ResponseEntity.ok(update);
	}
	@DeleteMapping("/product/{id}")
	public  ResponseEntity<String> delete(@PathVariable Long id){
	  
		
		return ResponseEntity.ok(ps.delete(id));
	}

}
