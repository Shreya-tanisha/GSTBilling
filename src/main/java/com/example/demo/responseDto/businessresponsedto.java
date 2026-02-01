package com.example.demo.responseDto;

import java.time.LocalDateTime;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class businessresponsedto {
	
		@NonNull
		@NotEmpty
		private String businessName ;
		
	    private String gstNumber ;
	   private String praddress ;
		private String state ;
		private String phone ;
	private LocalDateTime createAt ;

}
