package com.example.student;

public class Student {
    private int studentId;
    private String name;
    private String course;
    private String year;

    public Student() {
        System.out.println("🔧 No-arg Constructor: Pure Setter Injection Demo");
    }

    public Student(int studentId, String name, String course, String year) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
        System.out.println(" Constructor Injection: All fields injected");
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
        System.out.println("Setter: studentId = " + studentId);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter: name = " + name);
    }

    public void setCourse(String course) {
        this.course = course;
        System.out.println("Setter: course = " + course);
    }

    public void setYear(String year) {
        this.year = year;
        System.out.println("📝 Setter: year = " + year);
    }

    // Getters
    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public String getYear() { return year; }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', course='%s', year='%s'}", 
                           studentId, name, course, year);
    }
}
