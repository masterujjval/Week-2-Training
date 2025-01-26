package com.problem_statements.employee_management;

public class Main {
    public static void main(String args[]){

        //polymorphism
        Employee employee=new FullTimeEmployee("Ujjwal Gupta",123,600000);
        ((FullTimeEmployee)employee).assignDepartment("SDE");
        ((FullTimeEmployee)employee).getDepartmentDetails();
        employee.calculateSalary();


    }
}
