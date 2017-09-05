package com.practise.spring;

/**
 * Created by AmbaniP on 3/09/2017.
 */
public class Address {

    private String no;
    private String area;

    public Address() {
    }

    public Address(String no, String area) {
        this.no = no;
        this.area = area;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setArea(String area) {
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
