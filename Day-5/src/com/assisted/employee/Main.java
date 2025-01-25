package com.assisted.employee;
public class Main {
    public static void main(String args[]){

        Manager manager=new Manager("Ujjwal Gupta",21,15000000,10);
        manager.displayDetails();

        Developer developer=new Developer("Akshit Patel","Java",7, 10000);
        developer.displayDetails();

        Intern intern=new Intern("Deepak Singh","Dart",12,1000);
        intern.displayDetails();



    }
}
