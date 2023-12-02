package com.dilip_tech.design_pattern.template;

public abstract class DataRenderer {
    public void render(){
        String data =readData();
        String processedData=processsData(data);
        System.out.println(processedData);

    }
    public abstract  String readData();
    public abstract String processsData(String data);

}
