package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id ;
	
	private String invoiceNumber ;
	private LocalDate invoiceDate; 
	@ManyToOne
	@JoinColumn(name="business_id")
	private Business business ;
	private Double totalAmount; 
	private Double totalGST ;
	private Double grandTotal ;
	  private Long businessId;         // Only ID, not full Business
	    private String businessName;  
	@OneToMany(mappedBy = "invoice",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
    private List<invoiceitem> items;
	

}
