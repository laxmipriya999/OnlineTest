package com.capg.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Test_table")				//table name
public class Test {
	
	@Id	
	
	   @Column(name="test_id")			//column for test id
	   private int testId;
	   @Column(name="test_date")		//column for test date
	   private LocalDate testDate;
	   @Column(name="test_title")		//column for test title
	   private String testTitle;
	   @Column(name="test_duration")	//column for test duration
	   private String testDuration;
	   public Test() {}
	   public Test(LocalDate testDate, int testId, String testTitle,String testDuration) {
	   	super();
	   	this.testDate = testDate;
	   	this.testId = testId;
	   	this.testTitle = testTitle;
	   	this.testDuration = testDuration;
	   }
	   public LocalDate getTestDate() {
			return testDate;
		}
		public void setTestDate(LocalDate testDate) {
			this.testDate = testDate;
		}
		public int getTestId() {
			return testId;
		}
		public void setTestId(int testId) {
			this.testId = testId;
		}
		public String getTestTitle() {
			return testTitle;
		}
		public void setTestTitle(String testTitle) {
			this.testTitle = testTitle;
		}
		public String getTestDuration() {
			return testDuration;
		}
		public void setTestDuration(String testDuration) {
			this.testDuration = testDuration;
		}
}
