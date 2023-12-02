package com.dilip_tech.design_pattern.abstractfactory;

public class XMLEmpDao implements Dao{

    @Override
    public void save() {
        System.out.println("XML Emp DAO");
    }
}
