import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double width = 0;
        double length = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        area = width * length;

        System.out.println("Are of the rectangle is: " + area);

        scanner.close();
    }
}
