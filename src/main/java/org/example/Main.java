package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("32010077", "Ramez", "Chreide"));
        students.add(new Student("77001023", "Zemar", "Edierhc"));
        students.add(new Student("10077320", "Alex", "Smith"));

        School school = new School(students);
        school.displayStudents();
        school.addStudent(new Student("12345", "Manuel", "Simon"));
        school.addStudent(new Student("23456", "Nguyen", "Quy"));
        school.displayStudents();

        Student targetStudent = school.getStudentById("10077320");
        System.out.println(targetStudent);
        school.removeStudentById("10077320");
        school.displayStudents();
        school.getStudentById("32010077").addCourse(new Course("Java", "Florian", "Homeoffice"));
        school.displayStudentCourses("32010077");

        Node n1 = new Node("test");
        Node n2 = new Node("test2");
        Node n3 = new Node("test3");
        LinkedList list = new LinkedList(n1);
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.add(n2);
        System.out.println(list.toString());
        list.add(n3);
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.removeByIndex(1);
        System.out.println(list.toString());
        System.out.println(list.getSize());
        list.removeLast();
        System.out.println(list.toString());
        System.out.println(list.getSize());
    }
}