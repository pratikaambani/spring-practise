package com.practise.spring;

/**
 * Created by AmbaniP on 3/09/2017.
 */
public class Address {

    private String no;
    private String area;

    public Address(String no, String area) {
        this.no = no;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "no='" + no + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
