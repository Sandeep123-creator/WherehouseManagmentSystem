package com.jsp.whs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.whs.entity.Wherehouse;
import com.jsp.whs.service.WherehouseService;
import com.jsp.whs.util.ResponseStructer;

@RestController
@RequestMapping("/Wherehoses")
public class WherehouseController{
	@Autowired
	private WherehouseService wherehouseService;
	
	@PostMapping
	public ResponseEntity<ResponseStructer<Wherehouse>> saveWherehouse(@RequestBody Wherehouse wherehouse){
		return wherehouseService.saveWherehouse(wherehouse);
		
	}
	
	public String wherehouseCreated() {
		return null;
		
	}

}
