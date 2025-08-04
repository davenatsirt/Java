 /*
  *   Weight Conversion Program
  */

 import java.util.Scanner;

 public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         char userChoice;
         double cLbsToKg = 0.453592;
         double pounds = 0;
         double kilos = 0;
         double convertion = 0;
         boolean isKilos = true;

         System.out.println("Welcome to Weight Conversion Program!!!");
         System.out.println("Input the letter of your choice!");
         System.out.println("a. lbs to Kgs");
         System.out.println("b. Kgs to lbs");
         System.out.print("\n");
         userChoice = scanner.next().toLowerCase().charAt(0);

         if (userChoice == 'a'){
             isKilos = true;
         }
         else if(userChoice == 'b'){
             isKilos = false;
         }
         else {
             System.out.println("You have input an invalid choice");
             return;
         }

         if(isKilos){
             System.out.print("Enter lbs Value: ");
             pounds = scanner.nextDouble();
             convertion = pounds * cLbsToKg;

             System.out.printf("%f lbs is equal to %.3f Kgs", pounds, convertion);
         }
         else {
             System.out.print("Enter Kgs Value: ");
             kilos = scanner.nextDouble();
             convertion = kilos / cLbsToKg;

             System.out.printf("%f Kgs is equal to %.3f lbs", kilos, convertion);
         }
         scanner.close();
     }
 }





