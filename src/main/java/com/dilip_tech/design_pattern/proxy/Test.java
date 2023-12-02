package com.dilip_tech.design_pattern.proxy;

public class Test {


    public static void main(String[] args) {

        Customer customer=new CustomerProxyImpl();

        System.out.println(customer.getId());
        System.out.println(customer.getOrders());
    }
}
