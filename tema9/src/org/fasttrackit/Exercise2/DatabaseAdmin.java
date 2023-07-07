package org.fasttrackit.Exercise2;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;
    public DatabaseAdmin(String firstName, String secondName, LocalDate birthday, String adress, LocalDate dateOfEmployement, String position, String dbTechnology) {
        super(firstName, secondName, birthday, adress, dateOfEmployement, position);
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAdress() {
        return "db admin:" + super.getAdress();
    }
}
