package org.fasttrack.tema11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    private List<StudentGrade> grades;

    public ReportGenerator(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public void generateReport() throws IOException {
        String filePath = "files/grade-reports.out";
        Classroom classroom = new Classroom(grades);
        StudentGrade maxStudent  = classroom.getMaxGrade();
        String maxLine = "The best grade is: " + maxStudent.getName() + " " + maxStudent.getGrade();
        int averageGrade = classroom.getAverageGrade();
        String averageLine = "The average grade of this classroom is: " + averageGrade;
        StudentGrade worstStudent = classroom.getWorstGrade();
        String worstLine = "The worst grade is: " + worstStudent.getName() + " " + worstStudent.getGrade();
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(maxLine);
        writer.write("\n" + averageLine);
        writer.write("\n" + worstLine);
        writer.close();
    }
}