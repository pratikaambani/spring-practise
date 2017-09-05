package com.practise.spring;

import java.util.List;

/**
 * Created by Pratik Ambani on 5/09/2017.
 */
public class FruitBasket {

    private String name;
    private List<String> fruits;

    public FruitBasket(String name, List<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer();
        buffer.append(name);
        buffer.append("contains: \n");

        for(String fruit : fruits) {
            buffer.append(fruit);
            buffer.append("\n");
        }
        return buffer.toString();
    }
}
