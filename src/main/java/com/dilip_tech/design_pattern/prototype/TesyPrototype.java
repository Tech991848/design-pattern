package com.dilip_tech.design_pattern.prototype;

public class TesyPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1=new Game();
        game1.setId(1);
        game1.setName("Overwatch");

         Game game2=game1.clone();

    }
}
