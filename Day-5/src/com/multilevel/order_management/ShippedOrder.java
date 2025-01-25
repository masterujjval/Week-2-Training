package com.multilevel.order_management;

public class ShippedOrder extends Order{

    private String trackingNumber;

    // Constructor for ShippedOrder
     ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Calling the constructor of the superclass Order
        this.trackingNumber = trackingNumber;
    }

    // Getter for trackingNumber
    public String getTrackingNumber() {
        return trackingNumber;
    }

    // Overriding the getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }


}
