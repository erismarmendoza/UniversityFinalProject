package com.university.view;

import java.util.Scanner;
import com.university.controller.UniversityController;

public class Menu {

    private Scanner scanner;
    private UniversityController controller;

    public Menu(UniversityController controller) {
        scanner = new Scanner(System.in);
        this.controller = controller;
    }

    public void showMenu() {

        // First run
        System.out.println("WELCOME TO THE UNIVERSITY SYSTEM!");

        int option;

        do {
            System.out.println("\nPLEASE SELECT AN OPTION");
            System.out.println("1. List teachers");
            System.out.println("2. List classes");
            System.out.println("3. Create student");
            System.out.println("4. Create class");
            System.out.println("5. Find student's classes");
            System.out.println("6. Exit");

            System.out.print("\nSelect an option: ");
            option = scanner.nextInt();

            switch (option) {

                case 1:
                    controller.listTeachers();
                    break;

                case 2:
//                    controller.listClasses();
                    break;

                case 3:
                    System.out.println("Create student");
                    break;

                case 4:
                    System.out.println("Create class");
                    break;

                case 5:
                    System.out.println("Find student's classes");
                    break;

                case 6:
                    System.out.println("Thanks for using the platform. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 6);
    }
}