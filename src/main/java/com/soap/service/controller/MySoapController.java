package com.soap.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.service.MyService;
import com.soap.service.mapper.MyServiceMapper;
import com.soap.type.GetProductDetailResponse;
import com.soap.type.Sum;
import com.soap.type.SumResponse;

@Endpoint
public class MySoapController {

	@Autowired
	private MyService myService;
	private static final String NAMESPACE_URI = "http://service.com/";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "sum")
	@ResponsePayload
	public SumResponse sum(@RequestPayload Sum request) {
		SumResponse response = new SumResponse();
		response.setReturn(myService.sum(request.getArg0(), request.getArg1()));
		return response;

	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProductDetail")
	@ResponsePayload
	public GetProductDetailResponse getProductDetail() {
		GetProductDetailResponse response = new GetProductDetailResponse();
		response.setReturn(MyServiceMapper.mapper.map(myService.getProductDetail()));
		return response;
	}
}
