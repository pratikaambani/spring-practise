package com.practise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by AmbaniP on 3/09/2017.
 */
public class App {
    public static void main(String args[]) {

        ApplicationContext context = new FileSystemXmlApplicationContext("spring-practise-4/beans.xml");

        Person person1 = (Person) context.getBean("person");
        System.out.println(person1);
        System.out.println("\n \n");

        //2.7 Retrieving details using p namespace
        Address address2 = (Address) context.getBean("addressreference2");
        System.out.println(address2);
    }
}
