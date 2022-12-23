package com.myhib.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDto {
	@Id
	
	
       private int id;
       private String name;
       private double english;
       private double maths;
       private double science;
       
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
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
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
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", english=" + english + ", maths=" + maths + ", science="
				+ science + "]";
	}
       
}
