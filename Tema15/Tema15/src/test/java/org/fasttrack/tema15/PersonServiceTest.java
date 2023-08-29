package org.fasttrack.tema15;

import org.fasttrack.Tema15.Exercises2.Person;
import org.fasttrack.Tema15.Exercises2.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {
    private PersonService service;

    @BeforeEach
    public void setup(){
        service = new PersonService();
    }

    @Test
    public void testAllServices(){
        Person Sergiu = new Person("Sergiu", 26);
        Person Florin = new Person("Florin", 36);
        Person Alin = new Person("Alin", 42);
        service.addPerson(Sergiu);
        Assertions.assertEquals(1, Sergiu.getId());
        service.addPerson(Florin);
        Assertions.assertNotEquals(3, Florin.getId());
        service.addPerson(Alin);
        Assertions.assertEquals(3, service.getAllPersonNames().size());
        service.removePerson(1);
        Assertions.assertNotNull(service.getPersonById(2));
        Assertions.assertEquals(2, service.getAllPersons().size());
        Assertions.assertEquals(1, service.getPersonsOlderThan(40).size());
        Assertions.assertNull(service.getPerson("Adrian"));
    }
}
