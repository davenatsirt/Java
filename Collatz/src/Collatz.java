import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int i = 0;

        System.out.println("Enter number: ");
        userInput = scanner.nextInt();

        while(userInput != 1)
        {
            //check if user input is even
            if (isEven(userInput)){
                System.out.println(" is even");
                userInput /= 2;
            }
            else {
                System.out.println(" is odd");
                userInput = userInput * 3 + 1;
            }
            System.out.println(userInput);
            i++;
        }
        System.out.println("reached in " + i + " steps");
        scanner.close();
    }
    static boolean isEven(int num){
        return (num % 2) == 0;
    }
}
