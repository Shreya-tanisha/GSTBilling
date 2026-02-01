package com.example.demo.requestDto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class invoicerequestdto {
	
	private Long business;
	private String invoiceNumber;
	private List<invoiceitemrequestdto> items;

}
