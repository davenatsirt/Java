/*
*       Java Quiz Game
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        //First string is for the questions, we only need 1D array.
        String[] questions = {  "1. What is the capital city of France?",
                                "2. Where does matcha originates?",
                                "3. What is the most common type of coffee?",
                                "4. What is the capital city of Japan?",
                                "5. What is the winter city in asia?"
        };

        //Second string is for the choices per questions, we need 2D array
        String[][] options = {  {"a. Paris", "b. Bordeaux", "c. Lyon", "d. Strasbourg"},
                                {"a. China", "b. Japan", "c. Korea", "d. Indonesia"},
                                {"a. Robusta","b. Liberica","c. Arabica","d. Excelsa"},
                                {"a. Hiroshima","b. Osaka","c. Kyoto","d. Tokyo"},
                                {"a. Gangwon-do","b. Sapporo","c. HaNoi","d. Sapa"}
        };

        char[] answers = {'a', 'a', 'c', 'd', 'b'};
        char userIn;
        int score = 0;

        System.out.println("****************************");
        System.out.println("Welcome to Java Quiz Game");
        System.out.println("****************************");

        //Display questions
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            //Display choices
            for (String option : options[i]) {
                System.out.println(option);
            }
            //Ask for user input of their choice
            System.out.print("Enter the letter of your choice: ");
            userIn = scanner.next().charAt(0);
            //Compare the user choice to string of ansers
            if (userIn == answers[i]){
                System.out.println("**********");
                System.out.println(" CORRECT! ");
                System.out.println("**********");
                score++;
                Thread.sleep(2000);
            }
            else {
                System.out.println("*********");
                System.out.println("  WRONG! ");
                System.out.println("*********");
            }
        }
        //Display the total score
        System.out.println("Your score is: " + score + " out of " + questions.length);


        scanner.close();
    }
}

