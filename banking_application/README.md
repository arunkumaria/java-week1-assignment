# Banking Application

## Objective
A console-based Java application to simulate basic banking operations.  
The project demonstrates class design, object relationships, menu handling, exception handling, and organized application flow.

## Features Implemented
- Deposit money into an account
- Withdraw money with minimum balance enforcement
- Balance inquiry with user-friendly output
- Transaction history with timestamps
- PIN-based authentication for secure access
- Support for multiple account holders
- Exception handling for:
  - Invalid numeric input
  - Negative deposit or withdrawal values
  - Withdrawal amounts greater than allowed balance
  - Menu input mismatch
  - Invalid PIN entry

## Technologies Used
- Java (JDK 17 or higher recommended)
- Collections Framework (`ArrayList`, `HashMap`, `List`)
- Console I/O (`Scanner`)
- Exception Handling (`try-catch`, `InputMismatchException`)
- Object-Oriented Programming principles (Encapsulation, Constructors, Getters/Setters)

## File Structure
banking-app/
├── BankAccount.java    # Represents account details, balance, PIN, and operations
├── Transaction.java    # Tracks deposits and withdrawals with timestamps
├── InputHandler.java   # Handles validated user input
├── BankingApp.java     # Manages menu flow, multiple accounts, and operations
└── Main.java           # Entry point to start the application

## Steps to Compile and Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/banking-app.git
   cd banking-app
2. Compile all .java files:
	javac *.java
3. Run the application:
	java Main
	
Sample Input and Output
===== Banking Application =====
1. Create Account
2. Deposit
3. Withdraw
4. Balance Inquiry
5. View Transactions
6. Exit
Enter your choice:1
Enter Account ID:101
Enter Holder Name:Arun
Enter Initial Balance:5000
Set PIN:1234
Account created successfully!

Enter your choice:2
Enter Account ID:101
Enter PIN:1234
Enter deposit amount:2000
Deposited:2000.0

Enter your choice:3
Enter Account ID:101
Enter PIN:1234
Current Balance:7000.0

Enter your choice:5
Enter Account ID:101
Enter PIN:1234
Deposit of 2000.0 at 2026-09-24T14:35:10

Author Details
Name: Arun Kumar I A

Location: Kushalnagar, Karnataka, India

Interests: Competitive programming, Java backend development

Skills: Java (Intermediate), Spring Boot (Beginner-Intermediate)
