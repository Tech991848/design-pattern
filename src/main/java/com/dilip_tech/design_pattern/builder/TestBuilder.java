package com.dilip_tech.design_pattern.builder;

public class TestBuilder {
    public static void main(String[] args) {
        HttpClient httpClient=new HttpClient("POST","ttwr.com",null,null,null,"{}");
        System.out.println(httpClient);

        HttpClient builderClient= new HttpClient.HttpClientBuiler().method("post").headers("{}").sercure(",","").body("{}").build();
        System.out.println(builderClient);
    }
}
