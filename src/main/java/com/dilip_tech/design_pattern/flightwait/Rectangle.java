package com.dilip_tech.design_pattern.flightwait;

public class Rectangle extends Shape{

    private String lable;


    private int length;
    private int breath;
    private String fillStyle;

    public Rectangle(){
        lable="Rectangle";
    }
    @Override
    public void draw(int length,int breath,String fillStyle){

        System.out.println("Rectangle{" +
                "lable='" + lable + '\'' +
                ", length=" + length +
                ", breath=" + breath +
                ", fillStyle='" + fillStyle + '\'' +
                '}');
    }
}
