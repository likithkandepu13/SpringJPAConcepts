package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaBasicsApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringJpaBasicsApplication.class, args);
		ProductCurd pr = (ProductCurd) con.getBean(ProductCurd.class);
		pr.addProduct();
		pr.getProductsById(1).forEach(System.out::println);
	}

}
