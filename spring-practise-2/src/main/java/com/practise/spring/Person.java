package com.practise.spring;

/**
 * Created by AmbaniP on 3/09/2017.
 */
public class Person {

    private int id;
    private String name;

    private Address address;


    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    //2.4 factory bean and factory methods
    public static Person getInstance() {
        System.out.println("getInstance called in beginning only");
        return new Person(1234, "personName");
    }
}
