package com.problem_statements.ecommerce_platform;

public class Main {

    public static void main(String args[]){

        // runtime polymorphism

        Product phone =new Electronics("Nothing phone 2A",142,24000);
        ((Electronics)phone).getDetails(); //upcasting

        System.out.println();
        Clothings jeans=new Clothings("CK Jeans",89,12000);
        jeans.getDetails();

        

    }

}
