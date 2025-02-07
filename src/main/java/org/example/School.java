package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<Student>();

    public School(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(String ID) {
        for(int i = 0; i < students.size(); i++) {
            if(ID == students.get(i).getID()) {
                return students.get(i);
            }
        }
        return new Student("404", "Not Found", "Not Found");
    }

    public void removeStudentById(String ID) {
        for(int i = 0; i < students.size(); i++) {
            if(ID == students.get(i).getID()) {
                students.remove(i);
                return;
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void displayStudents() {
        System.out.println("---- School students ----");
        for(Student student : students) {
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
