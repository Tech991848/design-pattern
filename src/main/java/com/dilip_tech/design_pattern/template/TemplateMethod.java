package com.dilip_tech.design_pattern.template;

public class TemplateMethod {
    public static void main(String[] args) {
        DataRenderer renderer=new XMLDataRemderer();
        renderer.render();

    }
}
