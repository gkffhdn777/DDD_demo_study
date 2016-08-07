package com.myshop.order.domain;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Embeddable
public class OrderNo implements Serializable {
	@Column(name="order_number")
	private String number;
	
	@SuppressWarnings("unused")
	private OrderNo(){}
	
	public OrderNo(String number){
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderNo other = (OrderNo) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	

}
