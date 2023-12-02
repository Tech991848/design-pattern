package com.dilip_tech.design_pattern.abstractfactory;

public class DBEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("Save Emp to DATABASE");
    }
}
