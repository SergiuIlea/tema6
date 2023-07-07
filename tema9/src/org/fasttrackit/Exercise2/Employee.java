package org.fasttrackit.Exercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Employee implements Person{
    private String firstName;
    private String secondName;
    private LocalDate birthday;
    private String adress;
    private LocalDate dateOfEmployement;
    private String position;

    public Employee(String firstName, String secondName, LocalDate birthday, String adress, LocalDate dateOfEmployement, String position){
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.adress = adress;
        this.dateOfEmployement = dateOfEmployement;
        this.position = position;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }
    @Override
    public LocalDate getBirthDay(){
        return birthday;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    public LocalDate getDateOfEmployement() {
        return dateOfEmployement;
    }

    public String getPosition() {
        return position;
    }
}
