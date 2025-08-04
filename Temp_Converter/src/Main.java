/*
* Temperature Converter Exercise using Ternary operators
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double tempFar = 0;
        double tempCel = 0;
        double conv = 0;
        char userChoice;

        System.out.println("Hello! Welcome to temperature Converter!!");
        System.out.println("Choose the letter of your choice");
        System.out.println("a. Farenheit to Celsius ");
        System.out.println("b. Celsius to Farenheit");

        System.out.print("Your choice is: ");
        userChoice = scanner.next().toLowerCase().charAt();



        scanner.close();

    }
}
