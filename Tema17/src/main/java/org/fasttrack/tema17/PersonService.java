package org.fasttrack.tema17;

import java.util.*;
import java.util.stream.Collectors;


public class PersonService {

    private static List<Person> people;

    public PersonService(List<Person> people) {
        this.people = people;
    }

    public List<String> listName(List<Person> people){
        return people.stream()
                .map(Person::getName)
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
        return splitNames(people).stream()
                .map(PersonWithSplitNames::getFirstName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

   public List<String > listFirstNameFirstLetterSecondName(List<Person> people) {
       List<String> list = new ArrayList<>();
       for (Person currPerson: people){
           String str[] = currPerson.getName().split(" ");
           list.add(str[0] + " " + str[1].charAt(0) + ".");
       }
       return list;
   }

   public List<Person> peopleBetween18And60(List<Person> people){
        return people.stream()
                .filter(Person -> Person.getAge() > 18 && Person.getAge() < 60)
                .collect(Collectors.toList());
   }

   public List<PersonWithSplitNames> peopleWithFirstNameA(List<Person> people) {
       return splitNames(people).stream()
               .filter(PersonWithSplitNames -> PersonWithSplitNames.getFirstName().startsWith("A"))
               .collect(Collectors.toList());
   }

   public List<String> uniqueNames(List<Person> people){
       List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
       List<String> list = new ArrayList<>();
       for(String currString: names){
           String str[] = currString.split(" ");
           list.add(str[0]);
       }
       return list.stream()
               .distinct()
               .collect(Collectors.toList());
   }

    public List<PersonWithSplitNames> sortByFirstName(List<Person> people){
        return splitNames(people).stream()
                .sorted(Comparator.comparing(PersonWithSplitNames::getFirstName))
                .collect(Collectors.toList());
    }

    public List<PersonWithSplitNames> sortBySecondName(List<Person> people){
        return splitNames(people).stream()
                .sorted(Comparator.comparing(PersonWithSplitNames::getLastName))
                .collect(Collectors.toList());
    }

    public List<PersonWithSplitNames> sortByFirstNameLastNameAge(List<Person> people){
        return splitNames(people).stream()
                .sorted(Comparator.comparing(PersonWithSplitNames::getFirstName)
                        .thenComparing(Comparator.comparing(PersonWithSplitNames::getLastName))
                        .thenComparing(Comparator.comparing(PersonWithSplitNames::getAge)))
                .collect(Collectors.toList());
    }

    public List<PersonWithSplitNames> splitNames(List<Person> people){
        List<PersonWithSplitNames> splitNamesList = new ArrayList<>();
        for(Person currPerson: people){
            String str[] = currPerson.getName().split(" ");
            PersonWithSplitNames newPerson = new PersonWithSplitNames(str[0], str[1], currPerson.getAge(), currPerson.getCity());
            splitNamesList.add(newPerson);
        }
        return splitNamesList;
    }
}
