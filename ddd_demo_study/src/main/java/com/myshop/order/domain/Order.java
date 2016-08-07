package com.myshop.order.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="purchase_order")
@Access(AccessType.FIELD)
public class Order {

	@EmbeddedId
	private OrderNo number;

	@Column(name = "state")
	@Enumerated(EnumType.STRING)
	private OrderState state;

	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	
	protected Order(){}
	
	/**
	 * 서버시작시 컨텐츠 생성 테스트 위함 추후 삭제
	 */
	public static Order createOrder(final OrderNo orderNo){
		return new Order(orderNo,OrderState.PREPARING);
	}
	
	public Order(OrderNo id, OrderState state){
		setNumber(id);
		this.state = state;
		this.orderDate = new Date();
	}
	
	private void setNumber(OrderNo number){
		if(number == null)throw new IllegalArgumentException("no number");
		this.number = number;
	}
	

	public OrderNo getNumber() {
		return number;
	}

	public OrderState getState() {
		return state;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	@Override
	public String toString() {
		return "Order [number=" + number.getNumber() + ", state=" + state + ", orderDate=" + orderDate + "]";
	}
	
	
}
