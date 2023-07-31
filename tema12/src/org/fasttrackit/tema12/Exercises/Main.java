package org.fasttrackit.tema12.Exercises;

import org.fasttrackit.tema12.Exercises.Ex1.Student;
import org.fasttrackit.tema12.Exercises.Ex2.Person;
import org.fasttrackit.tema12.Exercises.Ex2.PersonSorter;
import org.fasttrackit.tema12.Exercises.Ex3.Employee;
import org.fasttrackit.tema12.Exercises.Ex3.EmployeeSorter;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex1: ");
        Map<String, Integer> studentsGrades = new HashMap<>();
        studentsGrades.put("Alex", 8);
        studentsGrades.put("Vlad", 10);
        studentsGrades.put("Em", 9);
        studentsGrades.put("Bogdan", 9);
        studentsGrades.put("Adrian", 7);
        studentsGrades.put("Sebastian", 6);
        studentsGrades.put("Silviu", 5);
        Collection<Map.Entry<String, Integer>> allStudentsAndTheirGrades = studentsGrades.entrySet();
        System.out.println(allStudentsAndTheirGrades);
        System.out.println("The student with the highest grade is: " + Student.getStudentWithMaxGrade(studentsGrades));

        System.out.println();

        System.out.println("Ex2: ");
        Person Alex = new Person("Alex", 27, "brown");
        Person Vlad = new Person("VLad", 33, "black");
        Person Silviu = new Person("Silviu", 42, "gray");
        Person Bogdan = new Person("Bogdan", 22, "black");
        Person Sebastian = new Person("Sebastian", 22, "brown");

        PersonSorter sorter = new PersonSorter();
        sorter.addPerson(Alex);
        sorter.addPerson(Vlad);
        sorter.addPerson(Silviu);
        sorter.addPerson(Bogdan);
        sorter.addPerson(Sebastian);
        System.out.println("2.1 " + sorter.getPersonName());
        System.out.println("2.2 " + sorter.mapPersonNameToAge());
        System.out.println("2.3 The people older than 25 are: " + sorter.getPersonOlderThan(25));
        System.out.println("2.4 " + sorter.mapPersonHairColourToName());
        System.out.println("2.5 " + sorter.mapAgeToPerson());

        System.out.println();

        System.out.println("Ex3: ");
        Employee Sergiu = new Employee("Sergiu", 27, "brown", "poker", 3000);
        Employee Florin = new Employee("Florin", 33, "brown", "poker", 4000);
        Employee Em = new Employee("Em", 29, "brown", "poker", 2000);
        Employee Geanina = new Employee("Geanina", 25, "brown", "bar", 3000);
        Employee Monica = new Employee("Monica", 48, "red", "bar", 4000);
        EmployeeSorter employee = new EmployeeSorter();
        employee.addEmployee(Sergiu);
        employee.addEmployee(Florin);
        employee.addEmployee(Em);
        employee.addEmployee(Geanina);
        employee.addEmployee(Monica);
        System.out.println("3.1 The employees with saary bigger than 2500 are: " + employee.getSalariesBiggerThan(2500));
        System.out.println("3.2 " + employee.mapEmployeeToCompany());
        System.out.println("3.3 The sum of all salaries is: " + employee.getSumOfSalaries());
        System.out.println("3.4 " + employee.biggerSumOfSalaries());

        System.out.println();

        System.out.println("Ex4: ");


    }
}
