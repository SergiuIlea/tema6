package org.fasttrackit.tema10;

import org.fasttrackit.tema10.Exercise1.Basket;
import org.fasttrackit.tema10.Exercise2.BuquetOfFlowers;
import org.fasttrackit.tema10.Exercise3.Company;
import org.fasttrackit.tema10.Exercise3.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex1: ");
        Basket cos = new Basket();
        cos.add("mar");
        cos.add("mar");
        cos.add("banana");
        cos.add("ananas");
        cos.add("banana");
        cos.add("mar");
        cos.add("avocado");
        System.out.println("The number of total fruits is: " + cos.count());
        System.out.println("Are there any apples? " + cos.find("mar"));
        System.out.println("Are there any strawberries? " + cos.find("capsuni"));
        System.out.println("The position of banana is: " + cos.position("banana"));
        System.out.println("The unique fruits are: "+ cos.distinct());
        System.out.println("The number of unique fruits is: "+ cos.uniqueFruitsCount());
        cos.remove("banana");
        System.out.println("The new number of total fruits is: "+ cos.count());

        System.out.println();

        System.out.println("Ex2: ");
        BuquetOfFlowers buchet = new BuquetOfFlowers();
        buchet.add("trandafir");
        buchet.add("trandafir");
        buchet.add("lalea");
        System.out.println("Numarul florilor este: " + buchet.getAll().size());
        buchet.remove("lalea");
        System.out.println("Noul numar al florilor este: " + buchet.getAll().size());

        System.out.println();

        System.out.println("Ex3: ");
        Person Sergiu = new Person("Sergiu", "manager", 26);
        Person Vlad = new Person("Vlad", "crupier", 32);
        Person SergiuI = new Person("Sergiu", "sef de sala", 45);
        Person Emanuel = new Person("Emanuel", "crupier", 30);
        Person Alex = new Person("Alex", "crupier", 29);
        Person Bogdan = new Person("Bogdan", "crupier", 22);
        Company company = new Company();
        company.employ(Sergiu);
        company.employ(Vlad);
        company.employ(SergiuI);
        company.employ(Emanuel);
        company.employ(Alex);
        company.employ(Bogdan);
        System.out.println("Managerul companiei este: " + company.getManager());
        System.out.println("Angajatii cu numele Sergiu sunt: " + company.getPersonByName("Sergiu"));
        System.out.println("Angajatii mai mari de 29 de ani sunt: " + company.getPersonsOlderThan(29));
        System.out.println("Angajatii cu functie de crupier sunt: " + company.getPersons("crupier"));
    }
}
