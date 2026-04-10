package com.sunbeam;
import java.util.*; 
public class Calculator {
	
	private int accountNum;
	private int begBalance;
	private int tcharges;
	private int tcredits;
	private int creditlimit;
	
	Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Account Number : ");
		accountNum = sc.nextInt();
		System.out.println("Balance at Beginning : ");
		begBalance = sc.nextInt();
		System.out.println("Total Charge : ");
		tcharges = sc.nextInt();
		System.out.println("Total Credit : ");
		tcredits = sc.nextInt();
		System.out.println("Allowed credit Limit : ");
		creditlimit = sc.nextInt();
		
	}	
	public int calculate() {
		int newBal = begBalance + tcharges - tcredits;
		return newBal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.acceptRecord();
		int newBalance = c.calculate();
		System.out.println("New Balance : "+newBalance);
		if(newBalance > c.creditlimit) {
			System.err.println("Credit limit exceeded.");
		}	
		else
		{
			System.err.println("Within credit Limit.");
		}
	}
}
