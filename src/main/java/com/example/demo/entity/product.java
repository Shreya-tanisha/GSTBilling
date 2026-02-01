package com.example.demo.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class product {
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id ;
	private String productName ;
	private Double price ;
	private Double gstPercentage ;
	private LocalDateTime createdAt ;
	 @PrePersist
	    public void prePersist() {
	        if (createdAt == null) {
	            createdAt = LocalDateTime.now();
	        }
	 }

}
