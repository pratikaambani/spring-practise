package com.practise.spring;

/**
 * Created by AmbaniP on 3/09/2017.
 */
public class Person {

    private int id;
    private String name;

    public void speak() {
        System.out.println("Hi, I'm a person");
    }

    //------------------------------------------------------------------------------------------------------------------------
    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }


    //------------------------------------------------------------------------------------------------------------------------

    private int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
