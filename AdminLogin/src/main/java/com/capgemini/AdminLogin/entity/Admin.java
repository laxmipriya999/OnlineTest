package com.capgemini.AdminLogin.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdminDetails")
public class Admin {
     
	@Id
private String adminId;
   private String adminName;
	private String adminPassword;
	private LocalDate dateOfBirth;
	private String adminContact;
	
	public Admin()
	{
		
	}
	public Admin(String adminId, String adminName, String adminPassword, LocalDate dateOfBirth, String adminContact) {
		
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.dateOfBirth = dateOfBirth;
		this.adminContact = adminContact;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	
}
