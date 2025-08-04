import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

         double principalAmount = 0;
         double interestRate = 0;
         int nCompunded = 0;
         int nYears = 0;
         double interest = 0;

        System.out.print("Enter the principal amount: ");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        nCompunded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        nYears = scanner.nextInt();

        interest = principalAmount * (Math.pow(1 + (interestRate/nCompunded), (nCompunded * nYears)));

        System.out.printf("The total amount is equal to $%.2f", interest);

        scanner.close();
    }
}
