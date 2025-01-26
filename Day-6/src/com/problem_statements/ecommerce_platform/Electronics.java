package com.problem_statements.ecommerce_platform;

public class Electronics extends Product implements Taxable{

    Electronics(String name,int productId, int price){
        this.name=name;
        this.productId=productId;
        this.price=price;

    }
    // calculate tax
    @Override
  public void calculateDiscount(){
        float temp= (float) (0.18*(float)price);
        discount=(float)price-temp;
    }

    @Override
    public void calculateTax(){
        float temp=0.18f*discount;
        tax=discount+temp;
    }

    @Override
    public void getTaxDetails(){
        System.out.println("Total tax is: "+tax);
    }

    public void getDetails(){
        commonDetails();
        calculateDiscount();
        calculateTax();
        System.out.println("\nPrice after discount: "+discount);
        System.out.println("Total price with tax included: ");
        getTaxDetails();
    }

}
