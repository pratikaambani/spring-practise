package com.practise.spring;

/**
 * Created by Pratik Ambani on 5/09/2017.
 */
public class Animal {

    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "com.practise.spring.Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
