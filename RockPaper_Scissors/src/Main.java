/*
*       Rock, Paper, Scissors for beginners
* @psudo:
*       1. Declare Variables
*       2. Ask for user input
*       3. get a random choice from the computer
*       4. Check winner
*       5. Ask to play again
*       6. Good bye message
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices= {"rock", "paper", "scissors"};
        String userChoice;
        String compChoice;

        System.out.println("***************************************");
        System.out.println("Welcome to Rock, Paper, Scissors game");
        System.out.println("***************************************");

        System.out.print("Enter your choice: ");
        userChoice = scanner.nextLine().toLowerCase();

        //error handling
        if (!userChoice.equals("rock") &&
                !userChoice.equals("paper") &&
                !userChoice.equals("scissors")){
            System.out.println("Invalid Choice!");
        }

        compChoice = choices[random.nextInt(0, 3)];
        System.out.println("Computer's choice is: " + compChoice);

        if(userChoice.equals(compChoice)){
            System.out.println("It's a tie!");
        }
        else if (userChoice.equals("rock") && compChoice.equals("scissors")){
            System.out.println("You Win!");
        }
        else if (userChoice.equals("paper") && compChoice.equals("rock")){
            System.out.println("You Win!");

        }
        else if (userChoice.equals("scissors") && compChoice.equals("paper")) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("You Lose!");
        }

    }
}
