package com.movieapps.firebasepojoclasspractice;

/**
 * Created by acer on 1/31/2017.
 */

public class Student {
    private String studentName;
    private int studentAge;
    private String studentEmail;

    public Student(int studentAge, String studentEmail, String studentName) {
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentName() {
        return studentName;
    }
}
