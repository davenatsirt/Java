import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /* Inside the new Random(), you can input a parameter
        *  like new Random (begin, end) boundary
        *  Example:
        * new Random (1, 7) = it will generate numbers from 1 to 6
        *
        */
        Random random = new Random();

        int number;

        number = random.nextInt();


        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        double c = 0;

        System.out.println("Enter 1st side of the triangle: ");
        a = scanner.nextInt();
        System.out.println("Enter 2nd side of the triangle: ");
        b = scanner.nextInt();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse: " + c);
        scanner.close();

    }
}
