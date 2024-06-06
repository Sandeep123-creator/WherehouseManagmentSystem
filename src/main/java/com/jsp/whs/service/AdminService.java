package com.jsp.whs.service;

import org.springframework.http.ResponseEntity;

import com.jsp.whs.request.dto.AdminRequest;
import com.jsp.whs.response.dto.AdminResponse;
import com.jsp.whs.util.ResponseStructer;

public interface AdminService {


	ResponseEntity<ResponseStructer<AdminResponse>> saveAdminRequest(AdminRequest adminRequest);

}
