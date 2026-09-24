# java-week1-assignment
# Java Console Applications Repository

## Objective
This repository contains three Java console-based applications developed to practice object-oriented programming, exception handling, and Java Collections.  
Each project demonstrates class design, menu-driven flow, and practical use cases of Java fundamentals.

---

## 📘 Project 1: Library Management System

### Features Implemented
- Add a new book
- View all books
- Search for a book by ID or title
- Issue a book to a user
- Return a book
- Remove a book
- Track issued books by user (optional)
- Display only available books (optional)
- Sort books alphabetically (optional)
- Store book data in a file (optional)

### Technologies Used
- Java (JDK 17+)
- Collections (`ArrayList`)
- Encapsulation, constructors, getters/setters
- Console I/O (`Scanner`)

### File Structure
library-management/
├── Book.java
├── User.java
├── IssueRecord.java
├── InputHandler.java
├── Library.java
└── Main.java

Code

### Sample Run
===== Library Management System =====

Add Book

View Books

Search Book

Issue Book

Return Book

Remove Book

View Issue Records

Exit
Enter your choice:1
Enter Book ID:101
Enter Title:Java Basics
Enter Author:John Doe
Book added successfully!

Code

---

## 💰 Project 2: Banking Application

### Features Implemented
- Deposit money into an account
- Withdraw money with minimum balance enforcement
- Balance inquiry
- Transaction history with timestamps
- PIN-based authentication
- Multiple account holders
- Exception handling for invalid inputs

### Technologies Used
- Java (JDK 17+)
- Collections (`ArrayList`, `HashMap`)
- Exception Handling (`try-catch`, `InputMismatchException`)
- Console I/O (`Scanner`)

### File Structure
banking-app/
├── BankAccount.java
├── Transaction.java
├── InputHandler.java
├── BankingApp.java
└── Main.java

Code

### Sample Run
===== Banking Application =====

Create Account

Deposit

Withdraw

Balance Inquiry

View Transactions

Exit
Enter your choice:1
Enter Account ID:101
Enter Holder Name:Arun
Enter Initial Balance:5000
Set PIN:1234
Account created successfully!

Code

---

## 📚 Project 3: Java Collections Challenge

### Features Implemented
- **ArrayList Challenge**
  - Add, remove, update, search, display items
- **HashMap Challenge**
  - Insert, retrieve, update, check key, display entries
- **Queue Challenge**
  - Add, remove, peek, display queue
- Interactive menus for each challenge

### Technologies Used
- Java (JDK 17+)
- Collections (`ArrayList`, `HashMap`, `Queue`)
- Console I/O (`Scanner`)

### File Structure
collections-challenge/
├── ArrayListChallenge.java
├── HashMapChallenge.java
├── QueueChallenge.java
└── Main.java

Code

### Sample Run
===== Java Collections Challenge =====

ArrayList Challenge

HashMap Challenge

Queue Challenge

Exit
Enter your choice:1

=== ArrayList Challenge ===

Add Item

Remove Item

Update Item

Search Item

Display Items

Back to Main Menu
Enter your choice:1
Enter item to add:Java Basics
Added: Java Basics

Code

---

## Author Details
- **Name:** Arun Kumar I A
- **Location:** Kushalnagar, Karnataka, India  
- **Interests:** Competitive programming, Java backend development  
- **Skills:** Java (Intermediate), Spring Boot (Beginner-Intermediate)