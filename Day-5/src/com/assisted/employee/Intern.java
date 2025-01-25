package com.assisted.employee;
public class Intern extends EmployeeMamagement {
    String programmingLanguage;
    Intern(String name,String programmingLanguage,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;

        this.programmingLanguage=programmingLanguage;
    }
    void displayDetails(){
        System.out.println("Intern Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nProgramming Language: "+programmingLanguage);
    }
}
