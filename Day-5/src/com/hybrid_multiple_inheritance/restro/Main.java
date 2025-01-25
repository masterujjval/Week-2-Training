package com.hybrid_multiple_inheritance.restro;

public class Main {
    public static void main(String[] args) {
        // creating objects;

        Chef c=new Chef("Akshit",39);
        c.performDuties();

        Waiter w=new Waiter("Deepak",79);
        w.performDuties();

    }
}
