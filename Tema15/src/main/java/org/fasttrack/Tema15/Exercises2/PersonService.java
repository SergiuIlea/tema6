package org.fasttrack.Tema15.Exercises2;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private List<Person> people;
    private static int currId = 1;

    public PersonService(List<Person> people) {
        this.people = people;
    }

    public PersonService(){
        people = new ArrayList<>();
    }

    public Person addPerson(Person person){
        person.setId(currId);
        people.add(person);
        currId += 1;
        return person;
    }

    public Person removePerson(int id){
        Person person = null;
        for(Person currPerson: people){
            if(id == currPerson.getId()){
                person = currPerson;
            }
        }
        if(person == null){
            throw new RuntimeException();
        } else {
            people.remove(person);
            return person;
        }
    }

    public List<Person> getAllPersons(){
        return people;
    }

    public List<Person> getPersonsOlderThan(int age){
        List<Person> peopleOlderThan = new ArrayList<>();
        for(Person currPerson: people){
            if(age>0&&age<120){
                if(currPerson.getAge()>=age){
                    peopleOlderThan.add(currPerson);
                }
            }else throw new RuntimeException();
        }
        return peopleOlderThan;
    }

    public List<String> getAllPersonNames(){
        List<String> allNames = new ArrayList<>();
        for(Person currPerson: people){
            allNames.add(currPerson.getName());
        }
        return allNames;
    }

    public Person getPerson(String name){
        Person person = null;
        for(Person currPerson: people){
            if(currPerson.getName().equals(name)){
                person = currPerson;
            }
        }/*
        if(person == null){
            throw new RuntimeException();
        }else return person;
        // Am lasat partea asta ca si comentariu ca sa pot verifica la test
           assertNull fara sa imi arunce exceptia
        */
        return person;
    }

    public Person getPersonById(int id){
        Person person = null;
        for(Person currPerson: people){
            if(currPerson.getId()==id){
                person = currPerson;
            }
        }if(person == null){
            throw new RuntimeException();
        }else return person;
    }
}
