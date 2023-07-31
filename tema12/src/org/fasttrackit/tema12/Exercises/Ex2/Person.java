package org.fasttrackit.tema12.Exercises.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Person {
        private String name;
        private int age;
        private String hairColour;

    public Person(String name, int age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String toString(){
        return name + "; " + age + "; " + hairColour;
    }

}
