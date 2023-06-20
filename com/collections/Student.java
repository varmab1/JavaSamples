package com.collections;

public class Student {
    String FirstName;
    String LastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        FirstName = firstName;
        LastName = lastName;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
