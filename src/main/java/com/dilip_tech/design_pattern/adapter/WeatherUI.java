package com.dilip_tech.design_pattern.adapter;

import java.sql.SQLOutput;

public class WeatherUI {
    public void showTemprature(int zipcode){

WeatherAdapter adapter=new WeatherAdapter();
        System.out.println(adapter.findTemprature(zipcode));

    }

    public static void main(String[] args) {
        WeatherUI wui=new WeatherUI();
        wui.showTemprature(221002);
    }

}
