import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        String name = "Dave Tristan";

        //to get the length of the string
        int length = name.length();
        //to get the character using the index value
        char letter = name.charAt(0);
        //to find the letter using the first index
        int index = name.indexOf("t");
        //to find the letter with the last index
        int lastIndex = name.lastIndexOf("a");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        //convert the string to upper case
        name = name.toUpperCase();
        System.out.println("\n" + name);

        //convert the string to lower case
        name = name.toLowerCase();
        System.out.println("\n" + name);

        String name2 = "     Dave Tristan       ";

        //trim the white space
        name2 = name2.trim();
        System.out.println(name2);
        //replace the character inside the string with another character
        name2 = name2.replace("a", "e");
        System.out.println(name2);
        //check if the string is empty or not
        System.out.println(name2.isEmpty());

        //Check if the string contains a character (Case sensitive)
        if (name.contains("d")){
            System.out.println("Your name contains a Letter D");
        }
        else {
            System.out.println("Your name does not contain any letter D");
        }

        //To compare string with string
        String password = "ABCDEFG";

        if(password.equals("ABCDEFG")){
            System.out.println("You have an easy password");
        }
        else{
            System.out.println("Hello " + name);
        }

        //To avoid case sensitive comparison between strings
        if (password.equalsIgnoreCase("abcdefg")){
            System.out.println("You have an easy password");
        }
        else {
            System.out.println("Hello " + name);
        }

        //Sub-string topic
        String email = "davetristan@gmail.com";
        String username = email.substring(0, 11);
        //if you want to start in a certain index up to the end, there is no need to put a 2nd param
        //Key concept: substring(begin, end)
        String domain = email.substring(11);

        System.out.println("Your username is: " + username);
        System.out.println("Your domain is: " + domain);

        //to be more flexible
        String username2 = email.substring(0, email.indexOf("@"));
        String domain2 = email.substring(email.indexOf("@"));

        System.out.println(username2);
        System.out.println(domain2);


        //This is a sample email generator
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        String firstName;
//        String lastName;
//        int rNumber1;
//        int rNumber2;
//        int rNumber3;
//        String domain = "@gmail.com";
//
//        System.out.print("Enter your first name: ");
//        firstName = scanner.nextLine().toLowerCase();
//        System.out.print("Enter your last name: ");
//        lastName = scanner.nextLine().toLowerCase();
//        rNumber1 = random.nextInt(1, 100);
//        rNumber2 = random.nextInt(1, 100);
//        rNumber3 = random.nextInt(1, 100);
//
//        System.out.println("You can choose your email: ");
//        System.out.println(lastName + firstName + rNumber1 + domain);
//        System.out.println(firstName + lastName + rNumber2 + domain);
//        System.out.println(firstName + rNumber3 + lastName + domain);
    }
}
