package org.example;

public class Course {
    private String name;
    private String instructor;
    private String room;

    public Course(String name, String instructor, String room) {
        this.name = name;
        this.instructor = instructor;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course {" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
