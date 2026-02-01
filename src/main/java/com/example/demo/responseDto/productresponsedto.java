package com.example.demo.responseDto;

import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class productresponsedto {
	
		
		
		private Long id ;
		private String productName ;
		private Double price ;
		private Double gstPercentage ;
		private LocalDateTime createdAt ;

}
