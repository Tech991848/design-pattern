package com.dilip_tech.design_pattern.decorator;

public class TommatoPizzaDecorator extends PizzaDecorator{

    public TommatoPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Add Tomato Poppings");
    }
}
