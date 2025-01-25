package com.multilevel.order_management;

public class Main {
    public static void main(String argsp[]){

        Order order1 = new Order("O123", "2025-01-20");
        order1.displayOrderDetails();

        System.out.println();

        // Subclass ShippedOrder object
        ShippedOrder sorder = new ShippedOrder("O124", "2025-01-18", "TRK123456");
        sorder.displayOrderDetails();

        System.out.println();

        // Subclass DeliveredOrder object
        DeliveredOrder dorder = new DeliveredOrder("O125", "2025-01-15", "TRK789101", "2025-01-19");
        dorder.displayOrderDetails();

    }
}
