import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter the number: ");
        num = scanner.nextInt();

        boolean even = isEven(num);
        if(even){
            System.out.println("Number " + num + " is even");
        }
        else {
            System.out.println("Number " + num + " is odd");
        }

        scanner.close();
    }

    static boolean isEven(int num){
        return (num % 2) == 0;
    }

}