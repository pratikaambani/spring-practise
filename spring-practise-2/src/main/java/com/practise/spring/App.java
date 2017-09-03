package com.practise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by AmbaniP on 3/09/2017.
 */
public class App {
    public static void main(String args[]) {

        ApplicationContext context = new FileSystemXmlApplicationContext("spring-practise-2/beans.xml");

        //2.1
        Address address = (Address) context.getBean("addressreference");
        System.out.println(address);
        System.out.println("\n \n");

        //2.2
        Person person1 = (Person) context.getBean("person");
        System.out.println(person1);
        System.out.println("\n \n");

        //2.3. Scopes: singleton and prototype
        Person person2 = (Person) context.getBean("person");
        System.out.println(person2);
        person1.setAddress(new Address("Scope ", "Example"));
        System.out.println(person2);
        System.out.println("\n \n");

    }
}
