package com.practise.spring;

/**
 * Created by Pratik Ambani on 3/09/2017.
 */
public class PersonFactory {
    public Person createPerson(int id, String name) {
        System.out.println("Using factory to create person.");
        return new Person(id, name);
    }
}
