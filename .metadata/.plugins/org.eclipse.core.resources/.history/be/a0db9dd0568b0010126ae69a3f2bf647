package build;

import db.DBconnection;
import model.Student;
import dao.StudentDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    Student s = new Student(id, name, age, course, email);
                    StudentDAO.addStudent(s);
                    break;

                case 2:
                    List<Student> students = StudentDAO.getAllStudents();
                    for (Student stu : students) {
                        System.out.println("ID: " + stu.getId() + ", Name: " + stu.getName() +
                                ", Age: " + stu.getAge() + ", Course: " + stu.getCourse() +
                                ", Email: " + stu.getEmail());
                    }
                    break;

                case 3:
                    System.out.print("Enter ID of student to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new course: ");
                    String newCourse = sc.nextLine();

                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();

                    Student updatedStudent = new Student(updateId, newName, newAge, newCourse, newEmail);
                    StudentDAO.updateStudent(updatedStudent);
                    break;

                case 4:
                    System.out.print("Enter ID of student to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    StudentDAO.deleteStudent(deleteId);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}