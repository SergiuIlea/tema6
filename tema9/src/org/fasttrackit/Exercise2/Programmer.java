package org.fasttrackit.Exercise2;

import java.time.LocalDate;

public class Programmer extends Employee{
    private String language;

    public Programmer(String firstName, String secondName, LocalDate birthday, String adress, LocalDate dateOfEmployement, String position, String language){
        super(firstName, secondName, birthday, adress, dateOfEmployement, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
