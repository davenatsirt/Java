import  java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randNumber = 0;
        int userGuess = 0;
        int lives = 3;
        randNumber = random.nextInt(1, 10);

        System.out.println("Hi, Welcome to number guessing game!!!");
        System.out.println("You have three chances to guess the number");
        System.out.println("Guess the number from 1 to 10");

        do{
            System.out.print("What's your number guess: " );
            userGuess = scanner.nextInt();
            if (userGuess != randNumber)
            {
                lives--;
                System.out.println("Lives remaining: " + lives);
                if(lives == 0)
                {
                    System.out.println("Sorry you have used all your lives");
                    System.out.println("The correct number is: " + randNumber);
                    System.out.println("Better luck next time!!!");
                    System.out.println("I Love you, baby!!! ♡");
                    return;
                }
            }
        }while(userGuess != randNumber);

        System.out.println("CONRATULATIONS!!\nYou have guess the correct number!!!");
        System.out.println("I Love you, baby!!! ♡");

        scanner.close();
    }
}
