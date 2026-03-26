package com.sunbeam;

import java.util.Scanner;
import java.util.Set;

class Program{
	private String partNum;
	private String desc;
	private int quantity;
	private double price;
	
	
	public Program() {
		this.partNum = "";
		this.desc = "";
		this.quantity = 0;
		this.price = 0.0;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
			quantity=0;
		}
		else {
			this.quantity = quantity;
		}
	}	
	public int getQuantity() {
		return quantity;
	}
	public void setPrice(double price) {
		if(price < 0 ) {
			price = 0;
		}
		else {
			this.price = price;
		}
	}
	public double getPrice() {
		return price;
	}
	Scanner sc = new Scanner(System.in);
	public void acceptItem() {
		System.out.println("Part Number : ");
		String partNum = sc.next();
		setPartNum(partNum);
		sc.nextLine();
		System.out.println("Description : ");
		String desc = sc.nextLine();
		setDesc(desc);
		System.out.println("Quantity : ");
		int quantity = sc.nextInt();
		setQuantity(quantity);
		System.out.println("Price : ");
		double price = sc.nextDouble();	
		setPrice(price);
	}
	public void printRecord() {
		System.out.println("Part Number : "+getPartNum());
		System.out.println("Description : "+getDesc());
		System.out.println("Quantity : "+getQuantity());
		System.out.println("Price : "+getPrice());	
	}
	public double calcAmount()
	{
	   double res= getQuantity() * getPrice();
	   return res;
	
	}
}
public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Program[] p = new Program[3];
		
		Program p1 = new Program();
		
		p1.acceptItem();
		p1.printRecord();
	   
		double res = p1.calcAmount();
		System.out.println("Total Amount : "+res);
	}

}
