package com.dilip_tech.design_pattern.iterator;

public class Product {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Product(String name){
        this.name=name;

    }
}
