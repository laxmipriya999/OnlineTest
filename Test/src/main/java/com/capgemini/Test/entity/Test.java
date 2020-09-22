package com.capgemini.Test.entity;

import java.math.BigInteger;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="TestDetails")			//table name
public class Test {

	@Id
	private BigInteger id;
	private String title;
	private int testTotalMarks;
	private int testMarksScored;
	private LocalTime duration;
	private LocalDateTime starttime;
	private LocalDateTime endtime;
	
	
	@OneToMany(mappedBy="test",cascade=CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval=true)
	private Set<Question> testQuestions;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private User user;
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTestTotalMarks() {
		return testTotalMarks;
	}

	public void setTestTotalMarks(int testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}

	public int getTestMarksScored() {
		return testMarksScored;
	}

	public void setTestMarksScored(int testMarksScored) {
		this.testMarksScored = testMarksScored;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public LocalDateTime getStarttime() {
		return starttime;
	}

	public void setStarttime(LocalDateTime starttime) {
		this.starttime = starttime;
	}

	public LocalDateTime getEndtime() {
		return endtime;
	}

	public void setEndtime(LocalDateTime endtime) {
		this.endtime = endtime;
	}

	public Set<Question> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}
	
	
	
}
