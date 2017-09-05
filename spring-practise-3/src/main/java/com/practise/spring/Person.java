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

    public static Person getInstance(int id, String name) {
        System.out.println("getInstance called in beginning only, id: " + id + " and name: " + name);
        return new Person(id, name);
    }

    public void init() {
        System.out.println("Bean created: " + this);
    }

    //2.4
    public void onCreate() {
        System.out.println("Person created: " + this);
    }

    public void onDestroy() {
        System.out.println("Person destroyed..");
    }

}
