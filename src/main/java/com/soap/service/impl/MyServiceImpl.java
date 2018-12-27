package com.soap.service.impl;

import org.springframework.stereotype.Component;

import com.soap.service.MyService;
import com.soap.service.model.Product;

@Component
public class MyServiceImpl implements MyService {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public Product getProductDetail() {
		Product product = new Product();
		product.setName("Product Name.");
		return product;
	}

}
