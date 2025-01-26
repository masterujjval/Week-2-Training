package com.problem_statements.employee_management;

public class FullTimeEmployee extends Employee implements Department{

    String dept;

    FullTimeEmployee(String name,int employeeId,int salary){
        super(name, employeeId);
        this.salary=salary;
    }

    @Override
    public void calculateSalary() {
    displayDetails();
        System.out.println("Salary of Fulltime Employee is: "+salary);
    }

    @Override
    public void assignDepartment(String dept){
this.dept=dept;
    }

    public void getDepartmentDetails(){
        System.out.println("Department: "+dept);
    }


}
