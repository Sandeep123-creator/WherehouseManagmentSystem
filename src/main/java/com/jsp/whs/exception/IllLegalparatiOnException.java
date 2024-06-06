package com.jsp.whs.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class IllLegalparatiOnException extends RuntimeException {
	
	private String message;

}
