package com.practise.spring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pratik Ambani on 5/09/2017.
 */
public class Jungle {

    private Map<String, String> foods = new HashMap<String, String>();
    private Map<String, Animal> animals = new HashMap<String, Animal>();

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        for (Map.Entry<String, String> entry : foods.entrySet()) {
            buffer.append(entry.getKey() + " : " + entry.getValue());
        }
        buffer.append("\n");

        return buffer.toString();
    }
}