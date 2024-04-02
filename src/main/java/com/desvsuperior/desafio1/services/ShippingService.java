package com.desvsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.desvsuperior.desafio1.entities.Order;
@Service
public class ShippingService {
	
	public double shippment(Order order) {
		
		if (order.getBasic() < 100.0) {
			return  20.0;
		}
		else if (order.getBasic() > 100.0 && order.getBasic() < 200.0) {
			return  12.0;
		}
		else
			return 0.0;
	}

}
