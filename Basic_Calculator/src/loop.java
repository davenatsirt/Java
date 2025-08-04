import java.util.Scanner;

public class loop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        do{
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
            if(age < 0 || age > 200){
                System.out.println("It is an impossible age!!!");
            }
        }while (age < 0 || age > 200);
        System.out.println(age);
    }
}