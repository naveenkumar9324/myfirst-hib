package com.myhib.myfirst_hib.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private double englis;
	private double maths;
	private double science;
	private double result;
	private double percentage;
	private String grade;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEnglis() {
		return englis;
	}
	public void setEnglis(double englis) {
		this.englis = englis;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", englis=" + englis + ", maths=" + maths + ", science="
				+ science + ", result=" + result + ", percentage=" + percentage + ", grade=" + grade + "]";
	}
	
	

}
