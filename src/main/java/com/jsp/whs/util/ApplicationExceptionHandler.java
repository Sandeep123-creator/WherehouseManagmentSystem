package com.jsp.whs.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	private ResponseEntity<ErrorStructer<String>> errorResponse(HttpStatus status , String message, String rootCause){
		return ResponseEntity
				.status(status)
				.body(new ErrorStructer<String>()
						.setStatus(status.value())
						.setMessage(message)
						.setRootCause(rootCause));
	}

}
