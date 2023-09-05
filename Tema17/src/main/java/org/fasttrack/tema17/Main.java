package org.fasttrack.tema17;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Sergiu", "Ilea", 26, "Oradea");
        Person p2 = new Person("Florin", "Apostol", 34, "Hunedoara");
        Person p3 = new Person("Alin", "Toma",  43, "Cluj");
        Person p4 = new Person("Sebastian", "Craciun", 17, "Oradea");
        Person p5 = new Person("Vlad", "Popa", 33, "Cluj");
        Person p6 = new Person("Vasile", "Crisan", 65, "Alba");
        Person p7 = new Person("Vlad", "Sirbu", 33, "Sebes");
        Person p8 = new Person("Vlad", "Sirbu", 26, "Aiud");


        List<Person> people = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

        PersonService service = new PersonService(people);

        System.out.println(service.listfullName(people));
        System.out.println(service.listMajor(people));
        System.out.println(service.listOradea(people));
        System.out.println(service.listOradeaOrCluj(people));
        System.out.println(service.listFirstNamesCapitalized(people));
        System.out.println(service.listFirstNameFirstLetterSecondName(people));
        System.out.println(service.peopleBetween18And60(people));
        System.out.println(service.peopleWithFirstNameA(people));
        System.out.println(service.uniqueNames(people));
        System.out.println(service.sortByFirstName(people));
        System.out.println(service.sortBySecondName(people));
        System.out.println(service.sortByFirstNameLastNameAge(people));
    }
}
