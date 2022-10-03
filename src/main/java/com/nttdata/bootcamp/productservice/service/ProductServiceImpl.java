package com.nttdata.bootcamp.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.productservice.dto.Productdto;

@Service
public class ProductServiceImpl implements ProductServiceI{
	
	@Autowired
	Environment environment;

	@Override
	public Productdto getProduct(int productId) {
		
			Productdto product = new Productdto();
			product.setProductId(productId);
			product.setChannel("GET");
			product.setServerPort(environment.getProperty("local.server.port"));
			return product;
		
	}

	@Override
	public Productdto postProduct(int productId) {
		// TODO Auto-generated method stub
		Productdto product = new Productdto();
		product.setProductId(productId);
		product.setChannel("POST");
		product.setServerPort(environment.getProperty("local.server.port"));
		return product;
	}

	
}
