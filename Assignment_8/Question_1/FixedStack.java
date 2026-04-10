package com.sunbeam;

import java.util.*;

public class FixedStack implements EmployeeStack {
		
		private Employee[] arr=new Employee[STACK_SIZE];
		
		private int top=-1;
		
		@Override
		public void push(Employee emp) {
			if(top==STACK_SIZE-1) {
				System.out.println("Full");
				return;
			}
			arr[++top]=emp;
			
		}
		@Override
		public Employee pop() {
			if(top == -1) {
				System.out.println("Empty");
				return null;
			}
			return arr[top--];
		}
	
	
	

}
