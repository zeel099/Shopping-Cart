package com.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		System.out.println("Starting Application...");
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

}
