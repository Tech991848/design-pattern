package com.dilip_tech.design_pattern.template;

public class XMLDataRemderer extends DataRenderer {
    @Override
    public String readData() {
        return "XML Data";
    }

    @Override
    public String processsData(String data) {
        return "Process "+data;
    }
}
