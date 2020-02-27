package com.json.productdetails;

public class DetailsArr {

    private String header;
    private String value;

    public DetailsArr(){

    }

    public DetailsArr(String header, String value) {
        this.header = header;
        this.value = value;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "header='" + header + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
