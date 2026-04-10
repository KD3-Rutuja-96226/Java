package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static Scanner sc = new Scanner(System.in);
	public static List<Student> list = new ArrayList<>();
	

	private static Student getStudents() {
		Student s = new Student();
		s.acceptRecord();
		return s;
	}
	public static void addStudent(Student s) {
		if(s!= null) {
			list.add(s);
			System.out.println("Student added ");
		}
	}
	
	private static void dispaly() {
		for(Student s : list) {
			System.out.println(s.toString());
		}	
	}
	
	
    public static void searchStud(List<Student> list) {
    	System.out.println("Enter student rollno :");
    	int rollNo =sc.nextInt();
    	
    	Iterator<Student> it = list.iterator();
    	
    	while(it.hasNext()) {
    		Student s= it.next();
    		if(s.getRollNo()==rollNo) {
    			System.out.println("Student detatils : "+s.toString());
    			break;
    		}
    	}
	}
	
	public static int menulist() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add Student");
		System.out.println("2.Dispaly all students");
		System.out.println("3.Search the student by rollno");
		System.out.println("4.Sort Students on rollno");
		System.out.println("5.Sort Students on name ");
		System.out.println("6.Sort Student on marks");
		
		System.out.println("Enter your choice :");
		choice=sc.nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		
		int choice;
		
		while((choice=menulist())!=0) {
			switch(choice) {
			
			case 1:
				Student stu=Program.getStudents();
				Program.addStudent(stu);
				break;
				
			case 2:
				Program.dispaly();
				break;
				
			case 3:
				Program.searchStud(list);
				break;
				
			case 4:
				list.sort((x,y)-> Integer.compare(x.getRollNo(), y.getRollNo()));
				Program.dispaly();
				
				break;
				
			case 5:
				list.sort((x,y) -> x.getName().compareTo(y.getName()));
				Program.dispaly();
				break;
             
			case 6:
				list.sort((x,y) -> Double.compare(x.getMarks(), y.getMarks()));
				Program.dispaly();
				
				break;
				
			}
	}

}
	
}
