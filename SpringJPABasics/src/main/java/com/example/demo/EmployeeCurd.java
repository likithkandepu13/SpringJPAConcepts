package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

import jakarta.transaction.Transactional;

@Component
public class EmployeeCurd {
	
	@Autowired
	EmployeeRepo erepo;
	
	public void addEmployee(int id,String name, int salary)
	{
		Employee e = new Employee();
		e.setPid(id);
		e.setEname(name);
		e.setEsalary(salary);
		erepo.save(e);
		System.out.println("Employee Inserted Successfully!");
	}
	
	public void deleteAllEmployee()
	{
		erepo.deleteAll();
	}
	
	//transactional is mandatory since, spring boot maintains the transaction management, to maintain the order.
	@Transactional
	public void deleteEmployeeById(int n)
	{
		erepo.deleteById(n);
	}
	
	
	//write the custome method by camelcase property name;
	@Transactional
	public void deleteEmployeeByName(String name)
	{
		erepo.deleteByEname(name);;
	}
	
	public void updateEmployee(int id,String name)
	{
		Optional<Employee> e = erepo.findById(id);
		if(e.isPresent())
		{
			Employee e1 = e.get();
			e1.setEname(name);
			erepo.save(e1);
		}
		else
		{
			System.out.println("Employee is not found with the given id "+id);
		}
	}

}
