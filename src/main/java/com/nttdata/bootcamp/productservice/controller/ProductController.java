package com.nttdata.bootcamp.productservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.controller.constants.EndPointUris;
import com.nttdata.bootcamp.productservice.dto.Productdto;
import com.nttdata.bootcamp.productservice.service.ProductServiceI;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping(EndPointUris.CONTROLLER)
public class ProductController {

	/**
	 * Instancia del servicio que gestiona los clientes.
	 */
	@Autowired
	private ProductServiceI productService;
	
	@Autowired
	Environment environment;
	
	
	@GetMapping(EndPointUris.ID)
	@CircuitBreaker(name = EndPointUris.PRODUCT_SERVICE, fallbackMethod = "getAllAviableProduct")
	public ResponseEntity<Productdto> getProduct(final @PathVariable int id){
		return ResponseEntity.ok(productService.getProduct(id));
	}
	
	public List<Productdto> getAllAviableProduct(Exception e){
		return Stream.of(
				new Productdto(1, "GET", "8082", "Zapatillas"),
				new Productdto(2, "GET", "8082", "Camisa"),
				new Productdto(3, "GET", "8082", "Chanclas")
		).collect(Collectors.toList());
	}
	
	
	@PostMapping(EndPointUris.ID)
	public ResponseEntity<Productdto> postProduct(final @PathVariable int id){
		return ResponseEntity.ok(productService.postProduct(id));
	}
}
