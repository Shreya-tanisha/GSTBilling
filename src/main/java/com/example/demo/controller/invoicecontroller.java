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

import com.example.demo.requestDto.invoicerequestdto;
import com.example.demo.responseDto.invoicceresponsedto;
import com.example.demo.service.invoiceService;

@RestController
@RequestMapping("/api")
public class invoicecontroller {
	@Autowired
	invoiceService is;
	@PostMapping("/invoice")
	public ResponseEntity<invoicceresponsedto>save(@RequestBody invoicerequestdto dt){
		invoicceresponsedto ss = is.save(dt);
		return ResponseEntity.ok(ss);
		}
	@GetMapping("/invoice/{id}")
	public ResponseEntity<invoicceresponsedto>get(@PathVariable Integer id){
		invoicceresponsedto ss1 = is.get(id);
		return ResponseEntity.ok(ss1);
		}
	@GetMapping("/invoice")
	public ResponseEntity<List<invoicceresponsedto>> get(){
		 List<invoicceresponsedto> list = is.get();
		return ResponseEntity.ok(list);
		}
}
