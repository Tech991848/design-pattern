package com.dilip_tech.design_pattern.facade;

public class TestFacade {
    public static void main(String[] args) {
        OrderFacade facade=new OrderFacade();
        facade.processOrder("Iphone",100);
    }
}
