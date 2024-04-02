package com.desvsuperior.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desvsuperior.desafio1.entities.Order;
import com.desvsuperior.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	
	
	private Order order1 = new Order(1034, 150.00, 20.00);
	private Order order2 = new Order(2282, 800.00, 10.0);
	private Order order3 = new Order(1309, 95.90, 0.0);
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor total: " + orderService.total(order1));
		System.out.println("================================================");
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: " + orderService.total(order2));
		System.out.println("================================================");
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: " + orderService.total(order3));
		System.out.println("================================================");
		
	}

}
