package com.dilip_tech.design_pattern.template;

public class CSVDataRenderer extends DataRenderer{
    @Override
    public String readData() {
        return "CSV Data";
    }

    @Override
    public String processsData(String data) {
        return "Processed "+data;
    }
}
