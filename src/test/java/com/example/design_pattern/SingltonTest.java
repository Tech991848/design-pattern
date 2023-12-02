package com.example.design_pattern;

import com.dilip_tech.design_pattern.SingletonLogger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingltonTest {
@Test
    public void singletonTest(){
     SingletonLogger exptected=SingletonLogger.getInstance();
     SingletonLogger actual=SingletonLogger.getInstance();
    Assertions.assertEquals(exptected,actual);

    }



}
