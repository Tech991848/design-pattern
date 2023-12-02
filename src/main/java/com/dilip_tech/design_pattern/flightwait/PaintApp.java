package com.dilip_tech.design_pattern.flightwait;

public class PaintApp {
    public void renderOld(int numberofShapes){
        Shape[] shapes=new Shape[numberofShapes+1];

        for(int i=1 ;i<=numberofShapes;i++){
            if (i % 2 ==0) {
                shapes[i]=new Circle();
                /*((Circle)shapes[i]).setRediuos(i);
                ((Circle)shapes[i]).setLineColor("red");
                ((Circle)shapes[i]).setFillColor("White");
                ((Circle)shapes[i]).draw();*/

            }else{
                shapes[i]=new Rectangle();
                /*((Rectangle)shapes[i]).setLength(i);
                ((Rectangle)shapes[i]).setBreath(i+i);
                ((Rectangle)shapes[i]).setFillStyle("Dotted");
                ((Rectangle)shapes[i]).draw();*/
            }

        }
    }

    public void render(int numberofShapes){
        Shape shape=null;
        for(int i=1 ;i<=numberofShapes;i++){
            if (i % 2 ==0) {
                shape=ShapeFactory.getShape("circle");
                shape.draw(i,"red","white");
            }else{
                shape=ShapeFactory.getShape("rectangle");
                shape.draw(i,i+i,"dotted");
            }

        }
    }


    public static void main(String[] args) {
        PaintApp app=new PaintApp();
        app.render(10);
    }
}
