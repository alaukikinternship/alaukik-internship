
package com.generics;

import java.util.*;
import com.generics.model.*;
import com.generics.service.*;

public class Main {

    public static void main(String gg[]) {

        Scanner sc = new Scanner(System.in);


        Repository<Student> repo = new Repository<>();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Get All Students");
            System.out.println("5. Search Student By ID");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Choice!");
                continue;
            }

            if (choice == 1) {

                try {
                    Student student = new Student();

                    System.out.print("Enter Student ID: ");
                    student.setId(sc.nextLine());

                    System.out.print("Enter Student Name: ");
                    student.setName(sc.nextLine());

                    System.out.print("Enter Student Email: ");
                    student.setEmail(sc.nextLine());

                    repo.add(student);

                    System.out.println("Student Added Successfully!");

                } catch (StudentException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (choice == 2) {

                try {
                    Student student = new Student();

                    System.out.print("Enter Student ID: ");
                    student.setId(sc.nextLine());

                    System.out.print("Enter New Name: ");
                    student.setName(sc.nextLine());

                    System.out.print("Enter New Email: ");
                    student.setEmail(sc.nextLine());

                    repo.update(student);

                    System.out.println("Student Updated Successfully!");

                } catch (StudentException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (choice == 3) {

                try {
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();

                    repo.delete(id);

                    System.out.println("Student Deleted Successfully!");

                } catch (StudentException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (choice == 4) {

                try {
                    List<Student> students = repo.getAll();

                    for (Student st : students) {
                        System.out.println(st.getId());
			System.out.println(st.getName());
			System.out.println(st.getEmail());
			System.out.println("***********************");
                    }

                } catch (StudentException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (choice == 5) {

                try {
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();

                    Student student = repo.getStudentById(id);

                    System.out.println("Student Id: "+student.getId());
			System.out.println("Student Name: "+student.getName());
			System.out.println("Student Email: "+student.getEmail());
                        System.out.println("**************");

                } catch (StudentException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (choice == 6) {

                System.out.println("Thank You!");
                break;
            }

            else {
                System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
