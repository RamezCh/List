package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<String, Student> students = new HashMap<String, Student>();

    public School(Map<String, Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.put(student.getID(), student);
    }

    public Student getStudentById(String ID) {
        return students.get(ID);
    }

    public void removeStudentById(String ID) {
        students.remove(ID);
    }

    public void displayStudents() {
        System.out.println("---- School students ----");
        for (Student student : students.values()) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public void displayStudentCourses(String ID) {
        Student target = this.getStudentById(ID);
        System.out.println("--- "+ target.getFirstName() + " " + target.getLastName() +" is in the following Courses ---");
        for(Course course: target.getCourses()) {
            System.out.println(course);
        }

    }
}
