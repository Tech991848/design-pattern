package com.dilip_tech.design_pattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{

    CustomerImpl customer=new CustomerImpl();
    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        List orders=new ArrayList<Order>();
        Order order1=new Order();
        order1.setId(1);
        order1.setProductName("IPhone");
        order1.setQuantity(1000);
        Order order2=new Order();
        order2.setId(2);
        order2.setProductName("IPhone-14");
        order2.setQuantity(2000);
        Order order3=new Order();
        order3.setId(3);
        order3.setProductName("IPhone-15");
        order3.setQuantity(1000);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);


        return orders;
    }
}
