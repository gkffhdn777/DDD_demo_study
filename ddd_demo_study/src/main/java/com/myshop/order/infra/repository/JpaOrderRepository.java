package com.myshop.order.infra.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.myshop.order.domain.Order;
import com.myshop.order.domain.OrderNo;
import com.myshop.order.domain.OrderRepository;

@Repository
public class JpaOrderRepository implements OrderRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void save(Order order) {
		entityManager.persist(order);
	}


	@Override
	public Order findById(OrderNo id) {
		return entityManager.find(Order.class, id);
	}

}
