package com.dilip_tech.design_pattern.decorator;

public class PizzaShop {
    public static void main(String[] args) {
Pizza pizza=new TommatoPizzaDecorator(new CheesePizzaDecorator( new PlainPizza()));
pizza.bake();

    }
}
