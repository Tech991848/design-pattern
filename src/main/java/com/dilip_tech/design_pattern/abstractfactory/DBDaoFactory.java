package com.dilip_tech.design_pattern.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        Dao dao=null;
        if(type.equals("emp")){
            dao=new DBEmpDao();
        } else if (type.equals("dep")) {
            dao=new DBDepDao();
        }
        return dao;
    }
}
