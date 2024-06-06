package com.jsp.whs.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.whs.entity.Admin;
import com.jsp.whs.enums.AdminType;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	boolean existsByAdminType(AdminType adminType);

}
