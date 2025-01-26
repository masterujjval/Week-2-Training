package com.problem_statements.online_food_delivery_system;

public interface Discountable {
    double applyDiscount();

    default void getDiscountDetails() {
        System.out.println("Discount applied as per the policy.");
    }
}