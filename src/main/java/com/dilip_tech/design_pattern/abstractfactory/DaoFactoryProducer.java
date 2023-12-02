package com.dilip_tech.design_pattern.abstractfactory;

public class DaoFactoryProducer {
    public static DaoAbstractFactory produce(String factoryType){
        DaoAbstractFactory daf=null;
        if (factoryType.equals("xml")){
            daf=new XmlDaoFactory();
        } else if (factoryType.equals("db")) {
            daf=new DBDaoFactory();
        }
        return daf;
    }
}
