package com.dilip_tech.design_pattern.proxy;

import java.util.List;

public class CustomerImpl implements Customer {


    CustomerImpl(){
        this.id=121;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    private int id;
    private List<Order> orders;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }
}
