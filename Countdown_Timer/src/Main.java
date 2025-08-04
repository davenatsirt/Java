/*
*   This is a countdown timer exercise
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int sec = 0;

        System.out.println("Hello! Welcome to countdown timer program!!");
        // User input the number of minutes
        System.out.print("Enter the number of minutes: ");
        min = scanner.nextInt();
        //User input the number of seconds
        System.out.print("Enter the number of seconds: ");
        sec = scanner.nextInt();

        for (int i = min; i >= 0; i--)
        {
            for (int j = sec; j >= 0; j--)
            {
                System.out.printf("%d:%02d\n", min, sec);
                Thread.sleep(1000);
                sec--;
            }
            min--;
            sec = 59;
        }

        scanner.close();
    }
}
