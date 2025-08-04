import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        //method = a block of reusable code that is executed when called
        String name = "Dave";
        int age = 15;
        double num;
        String firstName;
        String lastName;
        String fullName;

        happyBirthday(name, age);
        System.out.print("Enter number: ");
        num = scanner.nextDouble();
        scanner.nextLine(); //Clear the newline from the input buffer

        num = square(num);
        System.out.println("Square is equal to: " + num);


        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();
        fullName = getFullName(firstName, lastName);
        System.out.println("Your full name is: " + fullName);

       if(ageCheck(age)){
           System.out.println("You're entitled to have a credit card");
       }
       else{
           System.out.println("You're a minor!");
       }

    }
    // Outside the main function create another reusable function
    static void happyBirthday(String name, int age){ //we add static keyword because we used the method in a static function
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday %s\n", name);
        System.out.printf("Happy Birthday %s\n", name);
        System.out.println("To you!!");
        System.out.printf("You're %d years old now!!\n", age);
    }
    static double square(double number){
        return number * number;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    static boolean ageCheck(int age){
        if (age >= 18)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
