package com.multilevel.order_management;

public class Order {

    private String orderId;
    private String orderDate;

    // Constructor for Order
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Getter for orderId
    public String getOrderId() {
        return orderId;
    }

    // Getter for orderDate
    public String getOrderDate() {
        return orderDate;
    }

    // Method to get the order status
    public String getOrderStatus() {
        return "Order placed.";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }

}
