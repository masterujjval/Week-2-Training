package com.problem_statements.employee_management;

public class PartTimeEmployee extends Employee implements Department{



String dept;

        PartTimeEmployee(String name,int employeeId,int salary){
            super(name, employeeId);
            this.salary=salary;
        }

        @Override
        public void calculateSalary() {
            displayDetails();
            System.out.println("Salary of PartTime Employee is: "+salary);
        }


    @Override
    public void assignDepartment(String dept){
        this.dept=dept;
    }

    public void getDepartmentDetails(){
        System.out.println("Department: "+dept);
    }



}
