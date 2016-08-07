package com.myshop.config;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.myshop.order.application.OrderService;
import com.myshop.order.domain.Order;
import com.myshop.order.domain.OrderNo;

@Configuration
public class InitConfig {
	private final static Logger log = LoggerFactory.getLogger(InitConfig.class);

	@Autowired
	private OrderService orderService;

	@PostConstruct
	private void init(){
		log.info("start.... order insert");
		try{

			for (int i = 0; i < 3; i++) {
				Order order = Order.createOrder(new OrderNo("order_"+i));
				orderService.save(order);
			}

		}catch(Exception e){
			log.info("init orders save fail.. : " , e);
			System.exit(1);
		}
	}
}
