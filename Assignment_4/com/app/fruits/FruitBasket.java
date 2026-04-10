package com.app.fruits;

import java.util.Scanner;

import com.app.fruits.*;
import com.app.fruits.Mango;
public class FruitBasket {
	public static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		System.out.println("\n0.Exit.");
		System.out.println("1.Add Mango.");
		System.out.println("2.Add Orange.");
		System.out.println("3.Add Apple.");
		System.out.println("4.Display Fruits in Basket.");
		System.out.println("5.Display name, color, weight, taste of all fresh fruits");
		System.out.println("6.Display tastes of all stale (not fresh) fruits in the basket");
		System.out.println("7.Mark a fruit as stale (by index)");
		System.out.println("8. Mark all sour fruits as stale ");
		System.out.println("9.Enter the Choice : ");
		int choice;
		choice = sc.nextInt();
		return choice;				
	}
	
	public static void main(String[] args) {
		int n,choice;
		System.out.println("Enter the Size of FruitBasket : ");
		n = sc.nextInt();
		Fruit[] arr = new Fruit[n];
		
		int count = 0;
		while ((choice = menuList())!=0) {
			switch (choice) {
			case 1: 
				if(count < arr.length) {
					arr[count] = new Mango("Mango", 1.5, "Yellow");
					count++;
				}				
				break;	
			case 2: 
				if(count < arr.length) {
					arr[count] = new Orange("Orange",2.5, "yellowish-orange");
					count++;
				}									
				break;
			case 3: 
				if(count < n) {
					arr[count] = new Apple("Apple", 0.5, "Red");
					count++;
				}								
				break;
			case 4: 
				for(Fruit f : arr){
					if(f != null) {
						System.out.println(f);
					}
				}
				break;
			case 5:
				for(Fruit f : arr){
					if(f != null && f.isFresh()) {
						System.out.println(f.toString()+"\nTaste: "+f.taste()+"\nisFresh : "+f.isFresh());
					}
				}
				break;
			case 6:
				for(Fruit f : arr) {
					if(f != null && !f.isFresh()) {
						System.out.println(f.getName() +" : "+f.taste());
					}
				}
				break;
			case 7:
				System.out.println("Enter the index : ");
				int i = sc.nextInt();
				if(i >= 0 && i < count) {
					arr[i].setFresh(false);
				}
				else {
					System.out.println("Invalid Index");
					
				}
				break;
			case 8:
				for(Fruit f : arr) {
					if(f != null && f.taste().equals("sour")) {
						f.setFresh(false);
					}
				}
			}
			
		}
		
		
	}

}
