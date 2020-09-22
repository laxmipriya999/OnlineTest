package com.capgemini.AdminLogin.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.AdminLogin.Dao.DaoClass;
import com.capgemini.AdminLogin.entity.Admin;


@Service
@Transactional
public class ServiceClass {

	@Autowired
	DaoClass dao;
	
	/*Admin login method will return admin details with particular adminId and adminPassword*/
	public Optional<Admin> adminLogin(String adminId,String adminPassword)
	{
		
		return dao.adminLogin(adminId, adminPassword);
	}
	

			
	/*Admin details are inserted into database manually*/
	public void addAdmin()
	{
		LocalDate l=LocalDate.of(1988,04,30);
		
		List<Admin> admin=Arrays.asList(
				(new Admin("abcd1234","rohit","Rohit@45",l,"India")),
				new Admin("alpha25","rahul","Rahul@25",l,"Hyderabad"),
				new Admin("beta1234","rahane","Rahane@45",l,"India")
				
				);
				
		dao.saveAll(admin);
	}
}
