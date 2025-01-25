package com.assisted.employee;
public class Manager extends EmployeeMamagement{

    int teamSize;
    Manager(String name,int age,int salary,int teamSize){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.teamSize=teamSize;
    }
    void displayDetails(){
        System.out.println("Manager Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nTeam Size: "+teamSize);
    }

}
