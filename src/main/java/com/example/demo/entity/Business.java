package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Business {
     @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String businessName ;
    private String gstNumber ;
   private String praddress ;
	private String state ;
	private String phone ;
private LocalDateTime createAt ;


//@jakarta.persistence.OneToMany(mappedBy = "business", cascade = CascadeType.ALL)
@OneToMany(mappedBy = "business", cascade = CascadeType.ALL)
List<invoice> invoices;

}
