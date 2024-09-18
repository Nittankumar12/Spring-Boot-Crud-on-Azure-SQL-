package com.nittan.spring.boot.azure.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootAzureSqlApplication {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping("add")
	public Employee addEmployee(@RequestBody Employee employee){
		return repository.save(employee);
	}

	@GetMapping("getAll")
	public List<Employee> getEmployees(){
		 return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureSqlApplication.class, args);
	}

}
