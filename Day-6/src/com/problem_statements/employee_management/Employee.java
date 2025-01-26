package com.problem_statements.employee_management;

abstract class Employee {

    protected int employeeId;
    protected String name;

    protected int salary;

    Employee(String name,int employeeId){//setter using constructor
        this.employeeId=employeeId;
        this.name=name;

    }
// getter
    public void displayDetails(){
        System.out.println("name: "+name+"\nemployee id: "+employeeId);
    }

    // abstract method
 public abstract void calculateSalary();
}
