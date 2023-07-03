package org.fasttrackit.Exercise4;

public class Student {
    private String name;
    private int grade;
    public static int nrOfStudents=0;
    public static double gradeSum=0;
    public Student(String nume, int nota){
        this.name = nume;
        this.grade = nota;
        nrOfStudents ++;
        gradeSum += grade;
    }
    public String getName(){return name;}

    public int getGrade(){return grade;}

    public static double gradeAverage(){
        double gAvg;
        gAvg = gradeSum/nrOfStudents;
        return gAvg;
    }
}
