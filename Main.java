import java.util.Scanner;
/**
 * create a class to represent ATM machine 
 * 
 * Design the interface for the ATM  with options 
 *  1) withdrawing
 *  2) depositing
 *  3) checking the balance 
 * 
 * withdraw money in a acceptable  limit
 * 
 * displaying message for every action
 *  
 */
// BankAccount class to represent the user's bank account
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " successfully.");
        } else {
            System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
        }
    }
}

// ATM class to represent the ATM machine
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to the ATM!");
    }

    public void displayOptions() {
        System.out.println("\nATM Options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        displayWelcomeMessage();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayOptions();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void checkBalance() {
        double balance = account.getBalance();
        System.out.println("Current Balance: $" + balance);
    }

    private void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}

class Main {
    public static void main(String[] args) {
        // Initialize bank account with initial balance
        BankAccount userAccount = new BankAccount(1000.0);
        
        // Create ATM object with user's bank account
        ATM atm = new ATM(userAccount);
        
        // Run ATM interface
        atm.run();
    }
}

// 🏧🚀 Title: Building an ATM Interface in Java

// Project Overview:
// As part of my Codsoft virtual Java programming internship, I embarked on creating an ATM interface in Java to simulate fundamental banking operations like withdrawing, depositing, and checking account balances.

// Key Components and Features:

// 💼 BankAccount Class: Implemented a BankAccount class to manage user accounts securely, allowing for depositing and withdrawing funds within acceptable limits.

// 🏦 ATM Class: Designed an ATM class for user interactions, featuring a user-friendly interface displaying options for banking tasks and providing informative feedback.

// 🖥️ User Interface Design: Crafted an intuitive user interface for the ATM, ensuring seamless navigation and clear prompts for actions.

// 🛡️ Input Validation: Implemented robust input validation mechanisms to ensure valid and secure transactions, preventing errors and unauthorized operations.

// Learning Outcomes:

// Strengthened Java programming skills, including object-oriented design principles and user input handling using the Scanner class.
// Explored UI/UX design concepts, enhancing the user experience and accessibility of the ATM interface.
//  •Enhanced understanding of transaction management, data validation, and error handling in banking software systems.
// Next Steps:

// Conduct comprehensive testing to validate system reliability and accuracy across various user scenarios.
// Explore advanced features like transaction history tracking and account management for future iterations.
// Conclusion:
// The ATM interface project was a pivotal learning experience, combining technical skills with user-centric design principles to create a functional and engaging banking application.

// #JavaProgramming #ATMInterface #SoftwareDevelopment #UIUXDesign #InternshipProject #LinkedInPost

