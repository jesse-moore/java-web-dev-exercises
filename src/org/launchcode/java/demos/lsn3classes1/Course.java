package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String name;
    private int credits;
    private ArrayList<Student> students;

    public Course(String name, int credits, ArrayList students) {
        this.name = name;
        this.credits = credits;
        this.students = students;
    }
}
