package org.fasttrackit.tema12.Exercises.Ex2;

import java.util.*;

public class PersonSorter {
    private List<Person> people;

    public PersonSorter(){
        this.people = new ArrayList<>();
    }

    public boolean addPerson(Person person) {
        return people.add(person);
    }

    public List<String> getPersonName(){
        List<String> names = new ArrayList<>();
        for (Person currentPerson: people){
            names.add(currentPerson.getName());
        }
        return names;
    }

    public Map<String, Integer> mapPersonNameToAge(){
        Map<String,Integer> nTa = new HashMap<>();
        for(Person currentPerson: people){
            nTa.put(currentPerson.getName(), currentPerson.getAge());
            }
        return nTa;
    }
    public List<Person> getPersonOlderThan(int age){
        List<Person> peopleByAge = new ArrayList<>();
        for(Person currentPerson: people){
            if(currentPerson.getAge() > age){
                peopleByAge.add(currentPerson);
            }
        }
        return peopleByAge;
    }

    public Map<String,List<String>> mapPersonHairColourToName(){
        Map<String, List<String>> hcTn = new HashMap<>();
        for(Person currentPerson: people){
            String currentHairColour = currentPerson.getHairColour();
            String name = currentPerson.getName();

            if(!hcTn.containsKey(currentHairColour)){
                List<String> listOfHairColours = new ArrayList<>();
                listOfHairColours.add(name);
                hcTn.put(currentHairColour, listOfHairColours);
            }
            else {
                List<String> existingHairColour = hcTn.get(currentHairColour);
                existingHairColour.add(name);
                hcTn.put(currentHairColour, existingHairColour);
            }
        }
        return hcTn;
    }

    public Map<Integer, List<Person>> mapAgeToPerson(){
        Map<Integer, List<Person>> aTp = new HashMap<>();
        for(Person currentPerson: people){
            int age = currentPerson.getAge();

            if(!aTp.containsKey(age)) {
                List<Person> listOfPersons = new ArrayList<>();
                listOfPersons.add(currentPerson);
                aTp.put(age, listOfPersons);
            }
            else {
                List<Person> existingAge = aTp.get(age) ;
                existingAge.add(currentPerson);
                aTp.put(age, existingAge);
            }
        }
        return aTp;
    }
}
