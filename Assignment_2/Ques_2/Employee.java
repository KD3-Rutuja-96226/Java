package com.sunbeam.karad;

import java.util.*;
public class Employee {
	
	private String fName;
	private String lName;
	private double salary;
	
	public Employee() {
		fName = "";
		lName = "";
		salary = 0.0;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfName() {
		return fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getlName() {
		return lName;
	}
	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}	
	}
	public double getSalary() {
		return salary;
	}
	
}
