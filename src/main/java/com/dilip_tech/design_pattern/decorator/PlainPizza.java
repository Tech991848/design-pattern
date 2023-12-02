package com.dilip_tech.design_pattern.decorator;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Backing Plain Pizza !");
    }
}
