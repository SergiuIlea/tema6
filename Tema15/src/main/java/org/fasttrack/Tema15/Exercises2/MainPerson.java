package org.fasttrack.Tema15.Exercises2;

public class MainPerson {
    public static void main(String[] args) {
        Person Sergiu = new Person("Sergiu", 26);
        Person Florin = new Person("Florin", 36);
        Person Alin = new Person("Alin", 42);
        PersonService service = new PersonService();
        service.addPerson(Sergiu);
        service.addPerson(Florin);
        service.addPerson(Alin);
        System.out.println(service.getAllPersons());
        service.removePerson(1);
        System.out.println(service.getAllPersonNames());
        System.out.println(service.getPersonsOlderThan(40));
        System.out.println(service.getPerson("Alin"));
        System.out.println(service.getPersonById(2));
    }
}
