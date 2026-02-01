package com.example.demo.requestDto;

import java.time.LocalDateTime;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class businessrequestdto {
	@NonNull
	@NotEmpty
	private String businessName ;
	@Size(min=10,max=10)
    private String gstNumber ;
   private String praddress ;
	private String state ;
	private String phone ;
private LocalDateTime createAt =LocalDateTime.now();

}
