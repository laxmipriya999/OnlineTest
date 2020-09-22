package com.capgemini.AdminLogin.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.AdminLogin.Service.ServiceClass;
import com.capgemini.AdminLogin.entity.Admin;



@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200")
public class Controller {

	

	@Autowired
	ServiceClass service;
	
	
	//Admin login method
	
	@RequestMapping("/adminLogin/{adminId},{adminPassword}")
	public String adminLogin(@PathVariable("adminId") String adminId,@PathVariable("adminPassword") String adminPassword) {
		Optional<Admin> adminDetails = service.adminLogin(adminId,adminPassword);
		
		return adminDetails.toString();
		
	}
	
	//Inserting Admin details into database
	@RequestMapping("/addAdmin")
	public void addAdmin()
	{
		service.addAdmin();
	}
	
	
}
