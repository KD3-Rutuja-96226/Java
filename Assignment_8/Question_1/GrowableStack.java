package com.sunbeam;

class GrowableStack implements EmployeeStack {
    private Employee[] arr = new Employee[STACK_SIZE];
    private int top = -1;

    public void push(Employee e) {
        if (top == arr.length - 1) {
          
            Employee[] temp = new Employee[arr.length * 2];
            for (int i = 0; i < arr.length; i++)
                temp[i] = arr[i];
            arr = temp;
        }
        arr[++top] = e;
    }

    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return null;
        }
        return arr[top--];
    }
}
