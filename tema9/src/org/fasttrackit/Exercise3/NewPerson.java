package org.fasttrackit.Exercise3;

import org.fasttrackit.Exercise2.Employee;
import org.fasttrackit.Exercise2.Programmer;

import java.time.LocalDate;
import java.time.Period;

public class NewPerson extends Employee {
    public NewPerson(String firstName, String secondName, LocalDate birthday, String adress, LocalDate dateOfEmployement, String position){
        super(firstName, secondName, birthday, adress, dateOfEmployement, position);
    }
    public void getFullName(){
        System.out.println("My name is: " + getFirstName() + " " + getSecondName());
    }
    public int getAge(){
        int age = Period.between(getBirthDay(), LocalDate.now()).getYears();
        return age;
    }

}
