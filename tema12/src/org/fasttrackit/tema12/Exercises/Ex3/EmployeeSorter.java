package org.fasttrackit.tema12.Exercises.Ex3;

import org.fasttrackit.tema12.Exercises.Ex2.Person;

import java.util.*;

public class EmployeeSorter {
    private List<Employee> employees;
    public EmployeeSorter() {
        this.employees = new ArrayList<>();
    }

    public boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    public List<Employee> getSalariesBiggerThan(int salary){
        List<Employee> peopleBySalaries = new ArrayList<>();
        for(Employee currentEmployee: employees){
            if(currentEmployee.getSalary() > salary){
                peopleBySalaries.add(currentEmployee);
            }
        }
        return peopleBySalaries;
    }
    public Map<String,List<Employee>> mapEmployeeToCompany(){
        Map<String, List<Employee>> eTc = new HashMap<>();
        for(Employee currentEmployee: employees){
            String currentCompany = currentEmployee.getCompany();

            if(!eTc.containsKey(currentCompany)){
                List<Employee> listOfCompanies = new ArrayList<>();
                listOfCompanies.add(currentEmployee);
                eTc.put(currentCompany, listOfCompanies);
            }
            else {
                List<Employee> existingCompany = eTc.get(currentCompany);
                existingCompany.add(currentEmployee);
                eTc.put(currentCompany, existingCompany);
            }
        }
        return eTc;
    }

    public int getSumOfSalaries(){
        int sum = 0;
        for (Employee currentEmployee: employees){
            sum += currentEmployee.getSalary();
        }
        return sum;
    }

    public String biggerSumOfSalaries() {
        int sumPoker = 0;
        int sumBar = 0;
        for (Employee currentEmployee : employees) {
            if (currentEmployee.getCompany().equals("poker")) {
                sumPoker += currentEmployee.getSalary();
            } else sumBar += currentEmployee.getSalary();
        }
        if (sumPoker > sumBar) {
            return "The bigger salary is paid by poker company and it's: " + sumPoker;
        } else return "The bigger salary is paid by bar company and it's: " + sumBar;
    }


}
