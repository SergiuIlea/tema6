package org.fasttrackit.tema12.Exercises.Ex1;

import java.util.Collections;
import java.util.Map;

public class Student {
    public static String getStudentWithMaxGrade(Map<String, Integer> grades){
        int maxGrade = (Collections.max(grades.values()));
        for(Map.Entry<String, Integer> studentName: grades.entrySet()){
            if(studentName.getValue() == maxGrade){
                return studentName.getKey() + ": " + studentName.getValue();
            }
        }
        return null;
    }


}
