package org.fasttrack.tema17;

import java.util.*;
import java.util.stream.Collectors;



public class PersonService {

    private List<Person> people;

    public PersonService(List<Person> people) {
        this.people = people;
    }

    public List<String> listfullName(List<Person> people){
        return people.stream()
                .map(Person -> Person.getfirstName() + " " + Person.getLastName())
                .collect(Collectors.toList());
    }

    public List<Person> listMajor(List<Person> people){
        return people.stream()
                .filter(Person -> Person.getAge() > 18)
                .collect(Collectors.toList());
    }

    public List<Person> listOradea(List<Person> people){
        return people.stream()
                .filter(Person -> Person.getCity().equals("Oradea"))
                .collect(Collectors.toList());
    }

    public List<Person> listOradeaOrCluj(List<Person> people){
        return people.stream()
                .filter(Person -> Person.getCity().equals("Oradea") || Person.getCity().equals("Cluj"))
                .collect(Collectors.toList());
    }

    public List<String> listFirstNamesCapitalized(List<Person> people){
        return people.stream()
                .map(Person::getfirstName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

   public List<String > listFirstNameFirstLetterSecondName(List<Person> people) {
       return people.stream()
               .map(Person -> Person.getfirstName() + " " + Person.getLastName().charAt(0) + ".")
               .collect(Collectors.toList());
   }

   public List<Person> peopleBetween18And60(List<Person> people){
        return people.stream()
                .filter(Person -> Person.getAge() > 18 && Person.getAge() < 60)
                .collect(Collectors.toList());
   }

   public List<Person> peopleWithFirstNameA(List<Person> people) {
       return people.stream()
               .filter(Person -> Person.getfirstName().charAt(0)=='A')
               .collect(Collectors.toList());
   }

   public Set<String> uniqueNames(List<Person> people){
       return people.stream()
               .map(Person::getfirstName)
               .collect(Collectors.toSet());
   }

    public List<Person> sortByFirstName(List<Person> people){
        return people.stream()
                .sorted(Comparator.comparing(Person::getfirstName))
                .collect(Collectors.toList());
    }

    public List<Person> sortBySecondName(List<Person> people){
        return people.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
    }

    public List<Person> sortByFirstNameLastNameAge(List<Person> people){
        return people.stream()
                .sorted(Comparator.comparing(Person::getfirstName)
                        .thenComparing(Comparator.comparing(Person::getLastName))
                        .thenComparing(Comparator.comparing(Person::getAge)))
                .collect(Collectors.toList());
    }
}
