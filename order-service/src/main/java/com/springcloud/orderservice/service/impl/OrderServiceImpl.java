package com.springcloud.orderservice.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.springcloud.orderservice.dto.OrderDTO;
import com.springcloud.orderservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public OrderDTO getOrderDetails() {
		OrderDTO orderDto = new OrderDTO();
		orderDto.setOrderId("Order-193003");
		orderDto.setOrderDesc("Nikon order");
		orderDto.setOrderTotal(982000);
		orderDto.setOrderDate(new Date().getTime());
		return orderDto;
	}

}
