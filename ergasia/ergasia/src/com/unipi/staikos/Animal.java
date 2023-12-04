package com.unipi.staikos;

import java.io.Serializable;

public class Animal implements Serializable {
    private String Name;
    private String Code;
    private String AnimalClass;
    private int weight;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getAnimalClass() {
        return AnimalClass;
    }

    public void setAnimalClass(String animalClass) {
        AnimalClass = animalClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight>0)
            this.weight = weight;
        else System.out.println("No negative weight");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0)
            this.age = age;
        else System.out.println("No negative age");

    }


}
