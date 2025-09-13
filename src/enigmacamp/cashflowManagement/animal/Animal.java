package com.enigmacamp.cashflowManagement.animal;

import java.util.Arrays;

public class Animal {
    public String name;
    public String color;
    public int age;
    public String[] hobbies;
    public Boolean isSleeping = false;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name, String color, int age, String[] hobbies) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "{" +
                "name = '" + name + '\'' +
                ", color = '" + color + '\'' +
                ", age = " + age +
                ", hobbies = " + Arrays.toString(hobbies) +
                ", is he sleeping rn? = " + (isSleeping ? "ofc" : "nah he wide awake") +
                "}\n";
    }

    public void wakeUp() {
        if (!isSleeping) {
            System.out.println(this.name + " already awake dude, don't bother him");
        }
        isSleeping = false;
        System.out.println("wake up ya lil snitch");
    }

    public void sleep() {
        if (!isSleeping) {
            System.out.println("go to sleep lil man");
        }
        isSleeping = true;
        System.out.println(this.name + " already sleepin dont bother him");
    }

}
