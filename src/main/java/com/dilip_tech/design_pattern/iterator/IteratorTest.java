package com.dilip_tech.design_pattern.iterator;

import java.net.SocketTimeoutException;

public class IteratorTest {
    public static void main(String[] args) {
        ProductCollection products=new ProductCollection();
        products.addProduct(new Product("Iphone"));
        products.addProduct(new Product("Iphone0"));
        products.addProduct(new Product("Iphone1"));
        products.addProduct(new Product("Iphone2"));

        Iterator iterator=products.createIterator();
        while(iterator.hasNext()){
           Product  product=(Product) iterator.next();
            System.out.println(product);
        }
    }
}
