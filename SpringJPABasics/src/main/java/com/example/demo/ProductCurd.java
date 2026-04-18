package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;

@Component
public class ProductCurd {
	
	@Autowired
	ProductRepo prepo;
	
	public void addProduct()
	{
		Product p=new Product();
		p.setPid(129);
		p.setPnam("promax");
		prepo.save(p);
	}
	public List<Product> getAllProducts()
	{
		return prepo.findAll();
	}
	public List<Product> getProductsById(int n)
	{
	    Optional<Product> prodobj = prepo.findById(n);

	    if(prodobj.isPresent())
	    {
	        return List.of(prodobj.get());
	    }

	    return new ArrayList<>();
	}
	public List<Product> getProductsByIdandName(String pnam,int pid)
	{
		return prepo.findByPnamAndPid(pnam, pid);
	}
	
	//update product is main task in JPA
	//------------------------------------------------------------------
	
	//there are two options in updating, where we use the existed data to update it.
	
	public void updateProduct()
	{
//		Product p=new Product();
//		p.setPid(129);
//		p.setPnam("iphoneeeepromax");
//		prepo.save(p);
	}
	
	//but majority cases above wont work, since the object with same id exists or may not exists
	//refer to employee class for best output.0

}
