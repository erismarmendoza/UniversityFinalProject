package com.university.model;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Teacher> teachers;
    private List<Student> students;
    private List<UniversityClass> classes;

    public University() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<UniversityClass> getClasses() {
        return classes;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addClass(UniversityClass universityClass) {
        classes.add(universityClass);
    }
}