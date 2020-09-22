package com.capgemini.Test.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="QuestionDetails")
public class Question  {

	@Id
	private BigInteger questionId;
   
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable=false)
	private Test test;
	
	private String questionOptions;
	
	private String questionTitle;
	private int questionAnswer;
	private int questionMarks;

	private int choosenAnswer; 
	private int marksScored;
	
	
	
	
	
	public BigInteger getQuestionId() {
		return questionId;
	}
	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}
	
	public void setTest(Test test) {
		this.test = test;
	}
	public String getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String questionOptions) {
		this.questionOptions = questionOptions;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public int getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChoosenAnswer() {
		return choosenAnswer;
	}
	public void setChoosenAnswer(int chosenAnswer) {
		this.choosenAnswer = chosenAnswer;
	}
	public int getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(int marksScored) {
		this.marksScored = marksScored;
	}
	
}
