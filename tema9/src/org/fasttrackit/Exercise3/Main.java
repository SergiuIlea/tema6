package org.fasttrackit.Exercise3;

import org.fasttrackit.Exercise2.DatabaseAdmin;
import org.fasttrackit.Exercise2.Employee;
import org.fasttrackit.Exercise2.Person;
import org.fasttrackit.Exercise2.Programmer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        NewPerson Sergiu = new NewPerson("Sergiu", "Ilea", LocalDate.of(1996, 9, 19), "Str. Cetatii, nr 372, ap 13",
                LocalDate.of(2022, 11, 20), "angajat");
        Sergiu.getFullName();
        System.out.println(Sergiu.getAge());
    }

}
