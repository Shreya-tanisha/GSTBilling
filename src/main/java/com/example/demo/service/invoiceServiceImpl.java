package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Business;
import com.example.demo.entity.invoice;
import com.example.demo.entity.invoiceitem;
import com.example.demo.entity.product;
import com.example.demo.mapping.invoiceMapper;
import com.example.demo.repository.businessrepository;
import com.example.demo.repository.invoicerepository;
import com.example.demo.repository.productrepository;
import com.example.demo.requestDto.invoiceitemrequestdto;
import com.example.demo.requestDto.invoicerequestdto;
import com.example.demo.responseDto.invoicceresponsedto;
import com.example.demo.util.invoicenumber;
@Service
public class invoiceServiceImpl implements invoiceService{
	@Autowired
	businessrepository br;
	@Autowired
	invoicerepository ir;
	@Autowired
	productrepository pr;

	@Override
	public invoicceresponsedto save(invoicerequestdto dt) {
		// TODO Auto-generated method stub
		Business b = br.findById(dt.getBusiness()).orElseThrow(() -> new RuntimeException("Business not found"));
		List<invoiceitem> invoice=new ArrayList<>();
		Double totalgst=0.0;
		Double granttotal=0.0;
		Double totalamount=0.0;
		
		invoice in=new invoice();
		in.setBusiness(b);
		in.setInvoiceDate(LocalDate.now());
		in.setInvoiceNumber(invoicenumber.generateInvoiceNumber());
		for(invoiceitemrequestdto items:dt.getItems()) {
		product p=pr.findById(items.getProductid()).orElseThrow(()->new RuntimeException("product not found"));
		invoiceitem it=new invoiceitem();
		it.setQuantity(items.getQuantity());
		it.setPrice(p.getPrice());
		it.setGstAmount((p.getGstPercentage()*it.getQuantity()*it.getPrice())/100);
		it.setTotalAmount(it.getGstAmount()*it.getQuantity()*it.getPrice());
		it.setProduct(p);
		it.setInvoice(in);
		totalgst+=it.getGstAmount();
		totalamount+=it.getQuantity()*it.getPrice();
		granttotal+=it.getTotalAmount();
		
		
		invoice.add(it);
		}
		in.setItems(invoice);
		in.setGrandTotal(granttotal);
		in.setTotalAmount(totalamount);
		in.setTotalGST(totalgst);
		
				
		return invoiceMapper.convertToDto(ir.save(in));
	}

	@Override
	public invoicceresponsedto get(Integer id) {
		// TODO Auto-generated method stub
		
		return invoiceMapper.convertToDto(ir.findById(id).get());
	}

	@Override
	public List<invoicceresponsedto> get() {
		// TODO Auto-generated method stub
		List<invoice> list = ir.findAllWithItems();
		List<invoicceresponsedto> arrayList = new ArrayList<>();
		for(invoice i:list) {
			arrayList.add(invoiceMapper.convertToDto(i));
		}
		return arrayList;
	}

}
