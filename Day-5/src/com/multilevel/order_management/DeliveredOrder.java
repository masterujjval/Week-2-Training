package com.multilevel.order_management;

public class DeliveredOrder extends ShippedOrder{

    private String deliveryDate;

    // Constructor for DeliveredOrder
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Calling the constructor of the superclass ShippedOrder
        this.deliveryDate = deliveryDate;
    }

    // Getter for deliveryDate
    public String getDeliveryDate() {
        return deliveryDate;
    }

    // Overriding the getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

}
