package com.jsp.whs.mapper;

import org.springframework.stereotype.Component;

import com.jsp.whs.entity.Admin;
import com.jsp.whs.request.dto.AdminRequest;
import com.jsp.whs.response.dto.AdminResponse;

@Component
public class AdminMapper {
	
	public Admin mapToSuperAdmin(AdminRequest adminRequest , Admin admin) {
		admin.setAdminId(adminRequest.getAdminId());
		admin.setAdminName(adminRequest.getAdminName());
		admin.setAdminEmail(adminRequest.getAdminEmail());
		admin.setAdminPassword(adminRequest.getAdminPassword());
		return admin;		
	}
	
	public AdminResponse mapToUserResponse(Admin admin) {
		return AdminResponse.builder()
				.adminId(admin.getAdminId())
				.adminEmail(admin.getAdminEmail())
				.adminName(admin.getAdminName())
				.build();
	}

}
