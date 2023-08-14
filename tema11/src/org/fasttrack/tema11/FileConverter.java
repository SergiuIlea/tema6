package org.fasttrack.tema11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileConverter {

    public List<StudentGrade> converter (String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        List<StudentGrade> students = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            String[] splitInfo = currentLine.split("\\|");
            String name = splitInfo[0];
            String discipline = splitInfo[1];
            int grade = Integer.parseInt(splitInfo[2]);
            StudentGrade currentStudentGrade = new StudentGrade(name, discipline, grade);
            students.add(currentStudentGrade);
        }
        return students;
    }
}