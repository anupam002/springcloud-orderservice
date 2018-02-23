package com.springcloud.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.orderservice.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping("/")
	public String getOrderDetails() {
		return "Details from instance -->"+instance + "==And =="+orderService.getOrderDetails().toString();
	}
}
