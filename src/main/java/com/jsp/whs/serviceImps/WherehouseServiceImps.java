package com.jsp.whs.serviceImps;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.whs.entity.Wherehouse;
import com.jsp.whs.service.WherehouseService;
import com.jsp.whs.util.ResponseStructer;
@Service
public class WherehouseServiceImps implements WherehouseService{

	@Override
	public ResponseEntity<ResponseStructer<Wherehouse>> saveWherehouse(Wherehouse wherehouse) {
		// TODO Auto-generated method stub
		return null;
	}



}
