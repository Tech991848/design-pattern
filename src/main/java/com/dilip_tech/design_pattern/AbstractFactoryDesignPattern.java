package com.dilip_tech.design_pattern;

import com.dilip_tech.design_pattern.abstractfactory.Dao;
import com.dilip_tech.design_pattern.abstractfactory.DaoAbstractFactory;
import com.dilip_tech.design_pattern.abstractfactory.DaoFactoryProducer;

public class AbstractFactoryDesignPattern {
    public static void main(String[] args) {

        DaoAbstractFactory daf=DaoFactoryProducer.produce("xml");
        Dao dao=daf.createDao("emp");
        dao.save();

    }


}
