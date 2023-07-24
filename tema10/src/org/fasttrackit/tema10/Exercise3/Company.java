package org.fasttrackit.tema10.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> employees;

    public Company(){
        this.employees = new ArrayList<>();
    }

    public Person getManager() {
        for (Person currentEmployee: employees) {
            if (currentEmployee.getPosition().equals("manager")) {
                return currentEmployee;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> angajati = new ArrayList<>();

        for (Person currentEmployee: employees) {
            if (currentEmployee.getPosition().equals(profession)) {
                angajati.add(currentEmployee);
            }
        }

        return angajati;
    }

    public List<Person> getPersonsOlderThan(int age) {
        List<Person> angajati = new ArrayList<>();

        for (Person currentEmployee: employees) {
            if (currentEmployee.getAge() > age) {
                angajati.add(currentEmployee);
            }
        }

        return angajati;

    }

    public List<Person> getPersonByName(String name) {
        List<Person> angajati = new ArrayList<>();

        for (Person currentEmployee: employees) {
            if (currentEmployee.getName().equals(name)) {
                angajati.add(currentEmployee);
            }
        }
        return angajati;
    }

    public boolean employ(Person person) {
        return employees.add(person);
    }
}
