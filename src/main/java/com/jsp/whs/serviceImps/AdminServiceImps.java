package com.jsp.whs.serviceImps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.whs.entity.Admin;
import com.jsp.whs.enums.AdminType;
import com.jsp.whs.exception.IllLegalparatiOnException;
import com.jsp.whs.mapper.AdminMapper;
import com.jsp.whs.repo.AdminRepository;
import com.jsp.whs.request.dto.AdminRequest;
import com.jsp.whs.response.dto.AdminResponse;
import com.jsp.whs.service.AdminService;
import com.jsp.whs.util.ResponseStructer;

@Service
public class AdminServiceImps implements AdminService{

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private AdminMapper adminMapper;

	@Override
	public ResponseEntity<ResponseStructer<AdminResponse>> saveAdminRequest(AdminRequest adminRequest) {
		if(adminRepository.existsByAdminType(AdminType.SUPER_ADMIN))
			throw new IllLegalparatiOnException("not found");
		
		Admin admin =adminMapper.mapToSuperAdmin(adminRequest , new Admin());
		admin.setAdminType(AdminType.SUPER_ADMIN);
		admin = adminRepository.save(admin);
		
		
		Admin admin1=adminRepository.save(adminMapper.mapToSuperAdmin(adminRequest, new Admin()));
		return ResponseEntity.status(HttpStatus.CREATED.value())
				.body(new ResponseStructer<AdminResponse>()
						.setStatus(HttpStatus.CREATED.value())
						.setMessage("Super Admin Object Created")
						.setBody(adminMapper.mapToUserResponse(admin1)));
	}

}
