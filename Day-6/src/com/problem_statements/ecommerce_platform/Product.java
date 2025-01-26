package com.problem_statements.ecommerce_platform;

abstract class Product {

    protected int productId;
    protected String name;
    protected int price;

    protected float tax;
    protected float discount;

    //abstract method
    abstract void calculateDiscount();

    //getter
   public void commonDetails(){
       System.out.println("Product Name: "+name+"\nProduct ID: "+productId+"\nProduct Price: "+price);
   }




}
