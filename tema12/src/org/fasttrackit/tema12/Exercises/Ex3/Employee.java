package org.fasttrackit.tema12.Exercises.Ex3;

import org.fasttrackit.tema12.Exercises.Ex2.Person;

public class Employee extends Person {
    private String company;
    private int salary;

    public Employee(String name, int age, String hairColour, String company, int salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return getName() + "; " + getAge() + "; " + getHairColour() + "; " + company + "; " + salary;
    }

}
