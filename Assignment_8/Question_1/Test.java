package com.sunbeam;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeStack stack = null;

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push");
            System.out.println("4. Pop");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                if (stack == null)
                    stack = new FixedStack();
                else
                    System.out.println("Stack already selected!");
                break;

            case 2:
                if (stack == null)
                    stack = new GrowableStack();
                else
                    System.out.println("Stack already selected!");
                break;

            case 3:
                if (stack == null) {
                    System.out.println("NO stack chosen");
                } else {
                    System.out.print("Enter id name salary: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    double sal = sc.nextDouble();
                    stack.push(new Employee(id, name, sal));
                }
                break;

            case 4:
                if (stack == null) {
                    System.out.println("NO stack chosen");
                } else {
                    Employee e = stack.pop();
                    if (e != null)
                        System.out.println("Popped: " + e);
                }
                break;

            case 5:
                System.out.println("Exiting");
                break;

            default:
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}