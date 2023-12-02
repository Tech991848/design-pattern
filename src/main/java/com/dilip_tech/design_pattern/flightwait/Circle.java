package com.dilip_tech.design_pattern.flightwait;

public class Circle extends Shape{

    private String lable;


    public Circle(){
        lable="Circle";
    }
    @Override
    public void draw(int redius,String fillcolor,String lineColor){ {


    }
        System.out.println("Circle{" +
                "lable='" + lable + '\'' +
                ", rediuos=" + redius +
                ", fillColor='" + fillcolor + '\'' +
                ", lineColor='" + lineColor + '\'' +
                '}');
    }
}
