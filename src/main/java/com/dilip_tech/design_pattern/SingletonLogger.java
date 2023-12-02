package com.dilip_tech.design_pattern;



import java.io.Serializable;

public class SingletonLogger implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    private static volatile SingletonLogger instance;
    private SingletonLogger() {}

    public static SingletonLogger getInstance() {
        if(instance==null) {
            synchronized(SingletonLogger.class){
                if (instance==null) {
                    instance= new SingletonLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Logger message is : "+message);
    }

    public Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}