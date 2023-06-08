package com.strings;

public class Student implements Comparable<Student>{
    String FirstName;
    String LastName;
    float GPA;
    Student(String firstName, String lastName, float GPA){
        this.FirstName=firstName;
        this.LastName=lastName;
        this.GPA=GPA;
    }

    @Override
    public int compareTo(Student o) {
        return this.LastName.compareTo(o.LastName);
    }
}
