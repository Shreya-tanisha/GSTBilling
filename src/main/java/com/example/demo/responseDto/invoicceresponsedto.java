package com.example.demo.responseDto;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Business;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class invoicceresponsedto {
private Long id ;
	
	private String invoiceNumber ;
	private LocalDate invoiceDate; 
	
	private Business business ;
	private Double totalAmount; 
	private Double totalGST ;
	private Double grandTotal ;
	private List<invoiceitemresponsedto> items;

}
