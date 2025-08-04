/*
*  Basic calculator using enhanced switches
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        char operator;

        System.out.println("Welcome to Basic Math Calculator!!");
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        double result= 0;

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 + num2;
            case '/' -> {
                if (num2 > 0) {
                    result = num1 / num2;
                }
                else {
                    System.out.println("Cannot be divided by zero");
                    return;
                }
            }
            default -> {
                System.out.println("You have input an invalid operator!!");
                return;
            }
        }
        System.out.printf("result is equal to: %.2f", result);

        scanner.close();
    }
}

