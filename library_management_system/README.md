# Library Management System

## Objective
A console-based Java application to manage books and basic library operations.  
The project demonstrates class design, object relationships, menu handling, and organized application flow.

## Features Implemented
- Add a new book
- View all books
- Search for a book by ID or title
- Issue a book to a user
- Return a book
- Remove a book
- Exit the application
- (Optional) Track issued books by user
- (Optional) Display only available books
- (Optional) Sort books alphabetically
- (Optional) Store book data in a file

## Technologies Used
- Java (JDK 17 or higher recommended)
- Collections Framework (`ArrayList`, `List`)
- Console I/O (`Scanner`)
- Object-Oriented Programming principles (Encapsulation, Constructors, Getters/Setters)

## File Structure
library-management/
├── Book.java          # Represents book details
├── User.java          # Represents library members
├── IssueRecord.java   # Tracks issued books and users
├── InputHandler.java  # Handles validated user input
├── Library.java       # Manages collection of books and operations
└── Main.java          # Runs the application menu and user flow

## Steps to Compile and Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/java-week1-assignment.git
   cd java-week1-assignment
2. Compile all .java files:
	javac *.java
3. Run the application:
	java Main
Sample Input and Output
===== Library Management System =====
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. View Issue Records
8. Exit
Enter your choice:1
Enter Book ID:101
Enter Title:Java Basics
Enter Author:John Doe
Book added successfully!

===== Library Management System =====
Enter your choice:2
101 - Java Basics by John Doe [Available]
Author Details
Name: Arun Kumar I A

Location: Kushalnagar, Karnataka, India

Interests: Competitive programming, Java backend development

Skills: Java (Intermediate), Spring Boot (Beginner-Intermediate)


