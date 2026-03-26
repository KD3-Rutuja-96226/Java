package com.sunbeam.karad;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		//emp.acceptRecord();
		emp.setfName("Rutuja");
		emp.setlName("Likhar");
		emp.setSalary(50000);
		System.out.println("First Name : "+emp.getfName());
		System.out.println("Last Name : "+emp.getlName());
		System.out.println("Salary : "+emp.getSalary()*12);
		
		System.out.println("Raise Salary : "+emp.getSalary()*12*1.10);
		
		
		
		emp1.setfName("Sakshi");
		emp1.setlName("Tayade");;
		emp1.setSalary(80000);
		System.out.println("First Name : "+emp1.getfName());
		System.out.println("Last Name : "+emp1.getlName());
		System.out.println("Salary : "+emp1.getSalary()*12);
		System.out.println("Raise Salary : "+emp1.getSalary()*12*1.10);
		
		
		
		
		
		
		

	}

}
