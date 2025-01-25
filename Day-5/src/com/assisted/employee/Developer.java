package com.assisted.employee;

public class Developer extends EmployeeMamagement {
    String programmingLanguage;

    Developer(String name,String programmingLanguage,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;

        this.programmingLanguage=programmingLanguage;
    }
    void displayDetails(){
        System.out.println("Deverloper Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nProgramming Language: "+programmingLanguage);
    }



}
