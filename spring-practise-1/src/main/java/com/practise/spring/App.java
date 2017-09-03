package com.practise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by AmbaniP on 3/09/2017.
 */
public class App {
    public static void main(String args[]) {

        //1.1
        Person person1 = new Person();
        person1.speak();

        //1.2
        ApplicationContext context = new FileSystemXmlApplicationContext("spring-practise-1/beans.xml");
        Person person2 = (Person) context.getBean("person");
        person2.speak();

        //1.3 && 1.4
        System.out.println(person2);
    }
}
