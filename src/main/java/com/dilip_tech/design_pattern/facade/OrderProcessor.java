package com.dilip_tech.design_pattern.facade;

public class OrderProcessor {
    public boolean checkStock(String name){
        System.out.println("Checking strock");
        return true;
    }

    public String placeOrder(String name,int quantity){
        System.out.println("Order Placed");
        return "abc213";
    }
    public void shipOrder(String orderId){
        System.out.println("Order Shipped");
    }
}
