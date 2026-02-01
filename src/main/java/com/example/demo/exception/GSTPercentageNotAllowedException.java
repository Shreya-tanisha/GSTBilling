package com.example.demo.exception;

public class GSTPercentageNotAllowedException  extends RuntimeException{
	public GSTPercentageNotAllowedException(String msg){
		super(msg);
	}

}
