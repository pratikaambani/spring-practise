package com.practise.spring;

import java.util.List;

/**
 * Created by Pratik Ambani on 5/09/2017.
 */
public class Jungle {

    private Animal largest;
    private List<Animal> animals;

    public Animal getLargest() {
        return largest;
    }

    public void setLargest(Animal largest) {
        this.largest = largest;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("Largest: " + largest);
        buffer.append("\n");
        buffer.append("Others \n");

        for (Animal animal : animals) {
            buffer.append(animal);
            buffer.append("\n");
        }
        return buffer.toString();
    }
}