package com.myshop.order.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myshop.order.domain.Order;
import com.myshop.order.domain.OrderNo;
import com.myshop.order.domain.OrderRepository;

@Service
@Transactional
public class OrderService {

	@Autowired 
	private OrderRepository orderRepository;
	
	public void save(Order order){
		orderRepository.save(order);
	}
	
	public Order findById(String id){
		return orderRepository.findById(new OrderNo(id));
	}
	
}
