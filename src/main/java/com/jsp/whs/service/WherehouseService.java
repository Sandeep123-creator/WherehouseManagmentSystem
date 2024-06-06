package com.jsp.whs.service;

import org.springframework.http.ResponseEntity;

import com.jsp.whs.entity.Wherehouse;
import com.jsp.whs.util.ResponseStructer;

public interface WherehouseService{

	ResponseEntity<ResponseStructer<Wherehouse>> saveWherehouse(Wherehouse wherehouse);


}
