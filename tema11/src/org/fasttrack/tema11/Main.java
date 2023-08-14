package org.fasttrack.tema11;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "files/grades.txt";
        FileConverter converter = new FileConverter();
        List<StudentGrade> studentGrades = converter.converter(filePath);

        Classroom classroom = new Classroom(studentGrades);

        System.out.println("All the grades for Computer Science are: " + classroom.getGradesForDiscipline("Computer Science"));
        System.out.println("Grades of Marina Alimjan are: " + classroom.getGradesForStudent("Marina Alimjan"));
        System.out.println("The maximum grade for Mathematics is: " + classroom.getMaxGrade("Mathematics"));
        System.out.println("The maximum garde for any discipline is: " + classroom.getMaxGrade());
        System.out.println("The average grade for Physics is:  " + classroom.getAverageGrade("Physics"));
        System.out.println("The worst grade for History is: " + classroom.getWorstGrade("History"));
        System.out.println("The worst grade is: " + classroom.getWorstGrade());

        ReportGenerator report = new ReportGenerator(studentGrades);
        report.generateReport();
    }
}