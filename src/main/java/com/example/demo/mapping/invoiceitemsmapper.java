package com.example.demo.mapping;

import com.example.demo.entity.invoiceitem;

import com.example.demo.responseDto.invoiceitemresponsedto;

public class invoiceitemsmapper {
	
	public static invoiceitemresponsedto converttodto(invoiceitem itr) {
		invoiceitemresponsedto invoice=new invoiceitemresponsedto();
		
		invoice.setId(itr.getId());

		invoice.setInvoice(itr.getInvoice());
		invoice.setPrice(itr.getPrice());
		invoice.setGstAmount(itr.getProduct().getGstPercentage());
		invoice.setQuantity(itr.getQuantity());
		 invoice.setInvoiceId(itr.getInvoice().getId()); // only ID
		    invoice.setProductName(itr.getProduct().getProductName());
		invoice.setTotalAmount(itr.getTotalAmount());
		if(itr.getProduct()!=null) {
			 invoice.setProduct(itr.getProduct());
	            invoice.setGstAmount(itr.getProduct().getGstPercentage());
		}
		 if (itr.getInvoice() != null) {
	            invoice.setId(itr.getInvoice().getId());
	            invoice.setInvoice(itr.getInvoice());
	        }

		return invoice;
		
	}

}
