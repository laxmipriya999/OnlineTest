package com.capgemini.Test.entity;


import java.math.BigInteger;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="UserJpa")
public class User {
	@Id
	@Column(length=10)
private String userId;
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval=true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Test userTest;

	
	@Column(length=15)
private String password;
	@Column(length=15)
private String rePassword;
	@Column(length=10)
private BigInteger phonenumber;
	@Column(length=25)
	private String emailId;
public String getUserId() {
	return userId;
}
public Test getUserTest() {
	return userTest;
}
public void setUserTest(Test userTest) {
	this.userTest = userTest;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRePassword() {
	return rePassword;
}
public void setRePassword(String rePassword) {
	this.rePassword = rePassword;
}

public BigInteger getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(BigInteger phonenumber) {
	this.phonenumber = phonenumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

}
