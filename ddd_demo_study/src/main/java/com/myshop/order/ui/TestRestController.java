package com.myshop.order.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.order.application.OrderService;
import com.myshop.order.domain.Order;

@RestController
public class TestRestController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders/{orderNo}")
	public Order index(@PathVariable String orderNo){
		Order order = orderService.findById(orderNo);
		return order;
	}
	
}
