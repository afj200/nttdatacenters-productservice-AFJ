package com.nttdata.bootcamp.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.controller.constants.EndPointUris;
import com.nttdata.bootcamp.productservice.dto.Productdto;
import com.nttdata.bootcamp.productservice.service.ProductServiceI;

@RestController
@RequestMapping(EndPointUris.CONTROLLER)
public class ProductController {

	/**
	 * Instancia del servicio que gestiona los clientes.
	 */
	@Autowired
	private ProductServiceI productService;
	
	
	
	@GetMapping(EndPointUris.ID)
	public ResponseEntity<Productdto> getProduct(final @PathVariable int id){
		return ResponseEntity.ok(productService.getProduct(id));
	}
	
	@PostMapping(EndPointUris.ID)
	public ResponseEntity<Productdto> postProduct(final @PathVariable int id){
		return ResponseEntity.ok(productService.postProduct(id));
	}
}
