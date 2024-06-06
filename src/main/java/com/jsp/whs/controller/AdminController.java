package com.jsp.whs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.whs.request.dto.AdminRequest;
import com.jsp.whs.response.dto.AdminResponse;
import com.jsp.whs.service.AdminService;
import com.jsp.whs.util.ResponseStructer;

@RestController
@RequestMapping("/SuperAdmin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/Admins")
	public ResponseEntity<ResponseStructer<AdminResponse>> saveSuperAdminRequest(@RequestBody AdminRequest adminRequest){
		return adminService.saveAdminRequest(adminRequest);
		
	}

}
