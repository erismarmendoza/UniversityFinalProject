package com.university.controller;

import com.university.model.University;

public class UniversityController {

    private University university;

    public UniversityController(University university) {
        this.university = university;
    }

    public void listTeachers() {

        System.out.println("\n===== TEACHERS =====");

        for (var teacher : university.getTeachers()) {

            System.out.println("Name: " + teacher.getName());
            System.out.printf("Base salary: %,.2f%n", teacher.getBaseSalary());
            System.out.printf("Calculated salary: %,.2f%n", teacher.calculateSalary());
            System.out.println("--------------------");
        }
    }
}