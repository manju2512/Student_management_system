# 🎓 Student Management System

A console-based Java application that performs full CRUD operations on student records using JDBC and MySQL. Designed for backend learners who want hands-on experience with database integration and Java fundamentals.

---

## 🚀 Features

- Add new student records
- View all students
- Update student details
- Delete student records
- Menu-driven CLI interface

---

## 🛠️ Tech Stack

| Layer         | Technology        |
|---------------|-------------------|
| Language      | Java (JDK 17+)     |
| Database      | MySQL             |
| Connectivity  | JDBC              |
| IDE           | Eclipse / IntelliJ |
| Build Tool    | Maven (optional)  |

---

## 📦 Project Structure
Student_Management_System/ ├── build/            # Main class with menu-driven logic │   └── Main.java ├── dao/              # Data Access Object for CRUD operations │   └── StudentDAO.java ├── db/               # JDBC connection setup │   └── DBConnection.java ├── model/            # Student POJO class │   └── Student.java └── README.md


---

## 🗃️ Database Setup

Run the following SQL commands in MySQL Workbench or CLI:

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100),
    email VARCHAR(100)
);


⚙️ How to Run
1.  - Clone the repository:
git clone https://github.com/your-username/student_management_system.git

2.  - Open the project in your IDE.
    Eclipse or VScode recommended

3.  - Update DBConnection.java with your MySQL credentials:
        private static final String URL = "jdbc:mysql://localhost:3306/student_db";
        private static final String USER = "your_username";
        private static final String PASS = "your_password";

4.  - Run Main.java and follow the console prompts.


📌 Future Enhancements
- Add search by name or course
- Export student data to CSV
- Migrate to Spring Boot REST API
- Deploy with a hosted MySQL backend

🙌 Author
Manjunatha
Backend Developer | Java & Database Enthusiast
📍 Bengaluru, India



