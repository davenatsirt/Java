import java.sql.SQLOutput;
import java.util.Scanner; //in order to receive input values

public class Main {
    public static void main(String[] args){

        System.out.println("I like pizza");
        System.out.println("It's really good!");

        int age = 21;
        System.out.println("My age today is "+ age);

        age += age;
        System.out.println("My age tomorrow is " + age);

        char symbol = 'A';
        String name = "Tristan";
        System.out.println("Hello " + name);

        //Scanner is the name of the class and
        //scanner is the name of the object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        /* nextLine() will receive any string even with spaces
        if you don't want any spaces you can use next()
        Example input: Dave Tristan
        output: Dave*/
        String nameInput = scanner.nextLine();

        System.out.print("Enter your age: ");
        //nextInt can be use only for whole numbers
        int ageInput = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        //nextDouble is for floating numbers
        double gpaInput = scanner.nextDouble() ;

        System.out.print("Are you a student? (true/false): ");
        //nextBoolean is for boolean input
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + nameInput);
        System.out.println("You are " + ageInput + " years old");
        System.out.println("You're GPA is " + gpaInput);
        System.out.println("Student: " + isStudent);
        //Close the scanner
        scanner.close();
    }
}
