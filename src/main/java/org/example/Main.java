package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Medication paracetamol = new Medication("paracetamol", 4, true);
        Medication ibuprufen = new Medication("Ibuprufen", 5, true);
        Medication strepsils = new Medication("strepsils", 3, false);

        Pharmacy pharmacy = new Pharmacy();

        System.out.println(pharmacy);
        System.out.println(pharmacy.getCount());
        pharmacy.addMedication(paracetamol);
        System.out.println(pharmacy);
        pharmacy.addMedication(ibuprufen);
        System.out.println(pharmacy);
        pharmacy.addMedication(strepsils);
        System.out.println(pharmacy);
        System.out.println(pharmacy.getCount());
        System.out.println(pharmacy.find("ibuprufen"));
        pharmacy.delete("ibuprufen");
        System.out.println(pharmacy);
        System.out.println(pharmacy.getCount());

        System.out.println("--- School/Student ---");
        Map<String, Student> students = new HashMap<String, Student>();
        students.put("32010077", new Student("32010077", "Ramez", "Chreide"));
        students.put("77001023", new Student("77001023", "Zemar", "Edierhc"));
        students.put("10077320", new Student("10077320", "Alex", "Smith"));

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

        System.out.println("--- LinkedList ---");
        Node n1 = new Node("test");
        Node n2 = new Node("test2");
        Node n3 = new Node("test3");
        LinkedList list = new LinkedList(n1);
        System.out.println(list);
        System.out.println(list.getSize());
        list.add(n2);
        System.out.println(list);
        list.add(n3);
        System.out.println(list);
        System.out.println(list.getSize());
        list.removeByIndex(1);
        System.out.println(list);
        System.out.println(list.getSize());
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getSize());
    }
}