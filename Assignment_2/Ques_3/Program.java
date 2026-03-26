package com.sunbeam.question3;

import java.util.Scanner;

class Date{
	private int day;
	private int month;
	private int year;

	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2025;
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}	
}
class DateTest
{
	Date d = new Date();
	
	public void acceptDate() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Day : ");
	int day = sc.nextInt();
	d.setDay(day);
	
	System.out.println("Month : ");
	int month = sc.nextInt();
	d.setMonth(month);
	
	System.out.println("Year : ");
	int year = sc.nextInt();
	d.setYear(year);
	
	}
	
	public void printRecord() {
		System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
	}	
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTest dt = new DateTest();
		dt.acceptDate();
		dt.printRecord();
		

	}

}
