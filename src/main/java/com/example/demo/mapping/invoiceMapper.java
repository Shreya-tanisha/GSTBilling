package com.example.demo.mapping;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Business;
import com.example.demo.entity.invoice;
import com.example.demo.entity.invoiceitem;

import com.example.demo.responseDto.invoicceresponsedto;
import com.example.demo.responseDto.invoiceitemresponsedto;

public interface invoiceMapper {
	public static invoicceresponsedto convertToDto(invoice i) {
		invoicceresponsedto dt=new invoicceresponsedto();
		 Business bDto = new Business();
		    bDto.setId(i.getBusiness().getId());
		    bDto.setBusinessName(i.getBusiness().getBusinessName());
		    bDto.setGstNumber(i.getBusiness().getGstNumber());
		    bDto.setPhone(i.getBusiness().getPhone());
		    bDto.setState(i.getBusiness().getState());
		    bDto.setPraddress(i.getBusiness().getPraddress());
		dt.setBusiness(bDto);
		dt.setGrandTotal(i.getGrandTotal());
		dt.setInvoiceDate(i.getInvoiceDate());
		dt.setInvoiceNumber(i.getInvoiceNumber());
		dt.setTotalAmount(i.getTotalAmount());
		dt.setTotalGST(i.getTotalGST());
		dt.setId(i.getId());
		List<invoiceitemresponsedto> list =new ArrayList<>();
		for (invoiceitem item:i.getItems()) {
			
			list.add(invoiceitemsmapper.converttodto(item));
			
	
			
		}
		dt.setItems(list);
	
		return dt;
		
	}
}
