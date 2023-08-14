package org.fasttrack.tema11;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<StudentGrade> grades;

    public Classroom(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline =  new ArrayList<>();

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                gradesForDiscipline.add(studentGrade.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String studentName) {
        List<Integer> gradesForStudent = new ArrayList<>();

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getName().equals(studentName)) {
                gradesForStudent.add(studentGrade.getGrade());
            }
        }
        return gradesForStudent;
    }

    public StudentGrade getMaxGrade(String discipline) {
        int maxGrade = 0;
        StudentGrade maxStudentGrade = null;

        for (StudentGrade studentGrade: grades) {
            if (studentGrade.getDiscipline().equals(discipline) && studentGrade.getGrade() > maxGrade) {
                maxStudentGrade = studentGrade;
                maxGrade = studentGrade.getGrade();
            }
        }

        return maxStudentGrade;
    }

    public StudentGrade getMaxGrade(){
        int maxGrade = 0;
        StudentGrade maxStudentGrade = null;

        for(StudentGrade studentGrade: grades){
            if(studentGrade.getGrade() > maxGrade){
                maxStudentGrade = studentGrade;
                maxGrade = studentGrade.getGrade();
            }
        }
        return  maxStudentGrade;
    }

    public Integer getAverageGrade(String discipline) {
        int nrOfGrades = 0;
        int sumOfGrades = 0;

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                nrOfGrades++;
                sumOfGrades = sumOfGrades + studentGrade.getGrade();
            }
        }
        return sumOfGrades / nrOfGrades;
    }

    public Integer getAverageGrade(){
        int nrOfGrades = 0;
        int sumOfGrades = 0;

        for (StudentGrade studentGrade : grades) {
                nrOfGrades++;
                sumOfGrades = sumOfGrades + studentGrade.getGrade();
        }
        return sumOfGrades / nrOfGrades;
    }

    public StudentGrade getWorstGrade(String discipline){
        int minGrade = 10;
        StudentGrade minStudentGrade = null;

        for (StudentGrade studentGrade: grades) {
            if (studentGrade.getDiscipline().equals(discipline) && studentGrade.getGrade() <= minGrade) {
                minStudentGrade = studentGrade;
                minGrade = studentGrade.getGrade();
            }
        }

        return minStudentGrade;
    }

    public StudentGrade getWorstGrade(){
        int minGrade = 10;
        StudentGrade minStudentGrade = null;

        for(StudentGrade studentGrade: grades){
            if(studentGrade.getGrade() < minGrade){
                minStudentGrade = studentGrade;
                minGrade = studentGrade.getGrade();
            }
        }
        return  minStudentGrade;
    }
}