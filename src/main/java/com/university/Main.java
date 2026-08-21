package com.university;

import com.university.model.FullTimeTeacher;
import com.university.model.PartTimeTeacher;
import com.university.model.Student;
import com.university.model.Teacher;
import com.university.model.University;
import com.university.model.UniversityClass;
import com.university.controller.UniversityController;
import com.university.view.Menu;

public class Main {

    public static void main(String[] args) {

        University university = new University();

        // Defined teachers

        // Full-time teachers
        Teacher teacher1 =
                new FullTimeTeacher("Taylor Swift", 5000000, 5);

        Teacher teacher2 =
                new FullTimeTeacher("Harry Styles", 2000000, 2);

        // Part-time teachers
        Teacher teacher3 =
                new PartTimeTeacher("Zara Larsson", 2000000, 42);

        Teacher teacher4 =
                new PartTimeTeacher("Sabrina Carpenter", 1500000, 30);

        university.addTeacher(teacher1);
        university.addTeacher(teacher2);
        university.addTeacher(teacher3);
        university.addTeacher(teacher4);

        // Defined students

        Student student1 =
                new Student("Olivia", "1001", 20);

        Student student2 =
                new Student("Daniela.", "1002", 21);

        Student student3 =
                new Student("Yoonchae", "1003", 19);

        Student student4 =
                new Student("Lisa", "1004", 22);

        Student student5 =
                new Student("Jennie", "1005", 20);

        Student student6 =
                new Student("Rosé", "1006", 21);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);

        // Defined classes

        UniversityClass class1 =
                new UniversityClass(
                        "Programming",
                        "Room 101",
                        teacher1
                );

        UniversityClass class2 =
                new UniversityClass(
                        "Databases",
                        "Room 102",
                        teacher2
                );

        UniversityClass class3 =
                new UniversityClass(
                        "Networks",
                        "Room 103",
                        teacher3
                );

        UniversityClass class4 =
                new UniversityClass(
                        "English",
                        "Room 104",
                        teacher4
                );

        // Defined students in each class

        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);

        class2.addStudent(student2);
        class2.addStudent(student4);
        class2.addStudent(student5);

        class3.addStudent(student1);
        class3.addStudent(student5);
        class3.addStudent(student6);

        class4.addStudent(student3);
        class4.addStudent(student4);
        class4.addStudent(student6);

        // Adding classes to the university

        university.addClass(class1);
        university.addClass(class2);
        university.addClass(class3);
        university.addClass(class4);


        //        System.out.println("University initialized successfully!");
        UniversityController controller =
                new UniversityController(university);

        Menu menu = new Menu(controller);

        menu.showMenu();
    }
}