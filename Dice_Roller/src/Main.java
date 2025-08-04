/*
* Dice Roller Program
*
* @psudo:
*           - Declare variables
*           - Get the number of dice rolls from the user
*           - Roll the dice
*           - Get the sum of the dice rolled
*           - Display ASCII of dice
* */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice = 0;
        int sumOfDice = 0;
        int randomNumber = 0;

        System.out.println("********************************");
        System.out.println("Welcome to Dice Roller game!");
        System.out.println("********************************");

        System.out.print("Enter the number of dice to be rolled: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0){
            for (int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDice(roll);
                System.out.println("Random number " + (i + 1) + " is equal to: " + roll );
                sumOfDice += roll;
            }
            System.out.println("Total: " + sumOfDice);
        }
        else {
            System.out.println("Invalid input number of dice");
        }

        scanner.close();
    }
    static void printDice(int roll){

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                |   ●   |
                |       |
                |   ●   |
                 -------
                """;
        String dice3 = """
                 -------
                |●      |
                |   ●   |
                |      ●|
                 -------
                """;
        String dice4 = """
                 -------
                |●     ●|
                |       |
                |●     ●|
                 -------
                """;
        String dice5 = """
                 -------
                |●     ●|
                |   ●   |
                |●     ●|
                 -------
                """;
        String dice6 = """
                 -------
                |●     ●|
                |●     ●|
                |●     ●|
                 -------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid rolls");
        }
    }
}
