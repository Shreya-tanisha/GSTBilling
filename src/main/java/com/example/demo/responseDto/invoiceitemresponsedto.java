package com.example.demo.responseDto;


import com.example.demo.entity.invoice;
import com.example.demo.entity.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor



public class invoiceitemresponsedto {
	
	private Long id;
	
	private product product;
	private Integer quantity;
	private Double price;
	private Double gstAmount;
	private Double totalAmount;
	   private Long invoiceId;      // Instead of full Invoice
	    private String productName; 
	private invoice invoice;

}
