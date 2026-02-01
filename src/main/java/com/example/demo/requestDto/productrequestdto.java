package com.example.demo.requestDto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class productrequestdto {
	
		private String productName ;
		private Double price ;
		private Double gstPercentage ;
		private LocalDateTime createdAt ;

}
