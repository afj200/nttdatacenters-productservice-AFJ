package com.nttdata.bootcamp.productservice.service;

import com.nttdata.bootcamp.productservice.dto.Productdto;

public interface ProductServiceI {

	public Productdto getProduct(final int productId);
	
	public Productdto postProduct(final int productId);
}
