package com.dilip_tech.design_pattern.abstractfactory;

public class DBDepDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Department TO DB");
    }
}
