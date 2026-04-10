package com.sunbeam;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static Set<Project> setp = new TreeSet<>();
	public static Project[] getProject() {
		Project[] arr=new Project[5];
		arr[0]=new Project(1, "Train Reservation System", 5,5000000, "Java");
		arr[1]=new Project(2, "Airline Reservation System",3, 6000000, ".NET"); 
		arr[2]=new Project(4, "Online Grocery Shop", 6, 3000000, "Java"); 
		arr[3]=new Project(5, "Online Book Shop", 2, 3000000, ".NET");
		arr[4]=new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"); 
		arr[5]=new Project(2, "Bus Reservation System", 3, 3500000, "JS"); 
		
		return arr;
	}
	
	public static void addProject(Project[] arr) {
		for(Project p : arr) {
			setp.add(p);
		}
		
	}

	public static int menulist() {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Add Dummy Data");
		System.out.println("2.Input a Project");
		System.out.println("3.Display All Project from Set");
		System.out.println("4.Delete a Project by id from Set");
		System.out.println("5.Copy All Projects from Set ArrayList");
		System.out.println("6.Display all Projects from List");
		System.out.println("7.Sort all Projects in Listcby cost");
		System.out.println("8.Find Project with Max team size ");
		System.out.println("Enter the choice : ");
		choice=sc.nextInt();
		
		return choice;
		
	}
	public static void main(String[] args) {
		int choice;
		
		while((choice=menulist())!=0) {
			switch(choice) {
			
			case 1:
				Project[] p=Program.getProject();
				Program.addProject(p);
				
				break;	
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				break;
				
			case 7:
				break;
				
			case 8:
				break;
				
			
			}
		}
		
	}

}
