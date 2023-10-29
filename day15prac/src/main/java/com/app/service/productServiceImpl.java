package com.app.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.product;
import com.app.repository.daorRepo;
@Service
@Transactional
public class productServiceImpl implements productService {
	@Autowired
	private daorRepo dao;

	@Override
	public List<product> fetchall() {
		
		
		return dao.findAll();
	}


}
