package com.dilip_tech.design_pattern.adapter;

public class WeatherAdapter {

    public int findTemprature(int zipcode){

        String city=null;
        if(zipcode==221002){
            city="King of Asoia";
        }

        WeadherFinder finder=new WeatherFidnerImpl();
        int tempature=finder.find(city);

        return tempature;
    }
}
