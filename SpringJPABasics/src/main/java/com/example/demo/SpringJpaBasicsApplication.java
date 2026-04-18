package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;

@SpringBootApplication
public class SpringJpaBasicsApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringJpaBasicsApplication.class, args);
//		ProductCurd pr = (ProductCurd) con.getBean(ProductCurd.class);
//		pr.addProduct();
//		pr.getProductsById(1).forEach(System.out::println);
//		System.out.println("*************Printing all ****************");
//		pr.getAllProducts().forEach(System.out::println);
		EmployeeCurd ecurd = (EmployeeCurd) con.getBean(EmployeeCurd.class);
//		ecurd.addEmployee(7,"sai",999);
//		ecurd.deleteEmployeeByName("hello");
//		pr.updateProduct();
		ecurd.updateEmployee(3, "jagadeesh");
		
		
	}

}
