/*
* Java Banking Program for beginners
*
* @psudo:
*         1. Declare variables
*           - Initial amount inside the bank = $20,000
*         2. Display Menu
*         3. Get process and users choice
*           - Show balance
*           - Deposit
*           - Withdraw
*         4. Exit message
*/

import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        boolean isRunning = true;
        double initialBalance = 20000;
        double withdrawTotal = 0;
        double depositTotal = 0;
        char userInput;

        while(isRunning) {
            System.out.println("****************************");
            System.out.println("Welcome to Bank of Cebu!");
            System.out.println("****************************");
            System.out.println("How can we help you?");
            System.out.println("a. Balance Inquiry");
            System.out.println("b. Deposit");
            System.out.println("c. Withdraw");
            System.out.println("d. Exit");
            System.out.print("Please input the letter of your choice: ");
            userInput = scanner.next().toLowerCase().charAt(0);

            switch (userInput) {
                case 'a' -> showBalance(initialBalance);
                case 'b' -> initialBalance += deposit();
                case 'c' -> initialBalance -= withdraw(initialBalance);
                case 'd' -> isRunning = false;
                default -> System.out.println("You have input an invalid choice!");
            }
        }
        System.out.println("****************************");
        System.out.println("Thank you for trusting us! Have a nice day!");
    }
    static void showBalance(double balance){
        System.out.println("****************************");
        System.out.println("The remaining balance is: $" + balance);
    }
    static double deposit(){
        double depositAmount = 0;
        System.out.print("Enter the deposit amount: ");
        depositAmount = scanner.nextDouble();

        if(depositAmount < 0){
            System.out.print("The amount entered is invalid!");
            return 0;
        }
        else {
            return depositAmount;
        }
    }
    static double withdraw(double balance){
        double withdrawAmount = 0;

        System.out.print("Enter amount to be withdrawn: ");
        withdrawAmount = scanner.nextDouble();

        if (withdrawAmount < balance){
            return withdrawAmount;
        }
        else if(withdrawAmount < 0){
            System.out.println("Invalid amount!!");
            return 0;
        }
        else {
            System.out.println("Invalid transaction! Withdrawn amount is greater than remaining balance");
            return 0;
        }
    }
}