package com.desvsuperior.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desvsuperior.desafio1.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	 private ShippingService shippingService;
	 
	public double total(Order order) {
		return order.getBasic() - (order.getBasic() * order.getDiscount()/ 100) + shippingService.shippment(order);
	}

}
