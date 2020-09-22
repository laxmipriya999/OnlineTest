package com.capgemini.Test.Controller;

import java.math.BigInteger;


import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Test.Service.ServiceClass;
import com.capgemini.Test.entity.Question;
import com.capgemini.Test.entity.Test;
import com.capgemini.Test.entity.User;
import com.capgemini.exceptions.IdNotFoundException;


@RestController
@RequestMapping("/test")
@CrossOrigin("http://localhost:4200")
public class Controller {

	@Autowired
	private ServiceClass service;
	
	
	//Adding Test details into database
	@PostMapping("/addTest")
	public ResponseEntity<String> addTest(@RequestBody Test test) {
		Test testDetails = service.addTest(test);
		if (testDetails == null) {

			throw new IdNotFoundException("Test not added");

		} else {
			return new ResponseEntity<String>("Test added successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}
	
	
	
	
	//Retrieving test details with particular testId
	@GetMapping("/getTest/{testId}")
	public ResponseEntity<Optional<Test>> getTestById(@PathVariable("testId") BigInteger testId) {
		Optional<Test> testDetails = service.getTestById(testId);
		if (!testDetails.isPresent()) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return new ResponseEntity<Optional<Test>>(testDetails, new HttpHeaders(), HttpStatus.OK);
		}
	}
	
	
	
	//Retrieving all the test details from the database
	@GetMapping("/testdetails")
	public ResponseEntity<List<Test>> TestDetails(){
		List<Test> testDetails=service.testDetails();
		
		if (testDetails.isEmpty()) {
			throw new IdNotFoundException("No Tests available");
		} else {
			return new ResponseEntity<List<Test>>(testDetails, new HttpHeaders(), HttpStatus.OK);
		}
	}
	
	
	//Updating the test with particular testId
	@PutMapping("/updateTest/{testId}")
	public ResponseEntity<String> updateTest(@PathVariable("testId") BigInteger testId,@RequestBody Test test) {
		Test testDetails = service.updateTest(testId,test);
		if (testDetails == null) {
			
			throw new IdNotFoundException("Update Operation Unsuccessful,Provided testId does not exist");
		
		} else {
			return new ResponseEntity<String>("Test updated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}
	
	
	//Exception Handling
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
