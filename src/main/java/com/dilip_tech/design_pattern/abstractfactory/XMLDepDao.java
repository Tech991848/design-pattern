package com.dilip_tech.design_pattern.abstractfactory;

public class XMLDepDao implements Dao{

    @Override
    public void save() {
        System.out.println("Save XML Department Dao");
    }
}
