package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.requestDto.invoicerequestdto;
import com.example.demo.responseDto.invoicceresponsedto;


public interface invoiceService {
	public invoicceresponsedto save(invoicerequestdto dt);
   public  invoicceresponsedto get(Integer id);
   public List< invoicceresponsedto> get();
}
