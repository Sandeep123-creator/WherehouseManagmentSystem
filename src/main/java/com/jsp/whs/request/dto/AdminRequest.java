package com.jsp.whs.request.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdminRequest {
	
	private int adminId;
//	//The UserName should contain only alphabets. should not contains any numeric character, special character.
//	@Pattern(regexp = "^[A-Za-z]+$", message = "Name must contain only alphabets")
	private String adminName;
	
	//The email should be ending with @gmail.com 
//	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\\\.com$")
	private String adminEmail;
	
	
//	 @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()-_+=])[A-Za-z0-9!@#$%^&*()-_+=]{8,}$", 
//	            message = "Password must be alpha-numeric, contain at least 1 uppercase letter, 1 lowercase letter,"
//	            		+ " 1 special character, and 1 numeric character. It must be at least 8 characters long.")
	private String adminPassword;

}
