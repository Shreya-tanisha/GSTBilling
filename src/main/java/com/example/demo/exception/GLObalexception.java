package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GLObalexception {
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler
	public Map<String , String> handleException(NoSuchElementException e){
		Map<String, String> error = new HashMap<>();
		error.put("error", e.getMessage());
		return error;
	}
	
	@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler
	public Map<String , String> handleException(GSTPercentageNotAllowedException e){
		Map<String, String> error = new HashMap<>();
		error.put("error", e.getMessage());
		return error;
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler
	public Map<String , String> handleException(EmptyResultDataAccessException e){
		Map<String, String> error = new HashMap<>();
		error.put("error", e.getMessage());
		return error;
	}
	}

