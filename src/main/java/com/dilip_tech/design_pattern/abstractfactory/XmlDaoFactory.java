package com.dilip_tech.design_pattern.abstractfactory;

public class XmlDaoFactory extends DaoAbstractFactory{

    @Override
    public Dao createDao(String type) {
        Dao dao=null;
        if(type.equals("emp")){
            dao=new XMLEmpDao();
        } else if (type.equals("dep")) {
            dao=new DBDepDao();
        }
        return dao;
    }
}
