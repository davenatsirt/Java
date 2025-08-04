/*
*   Array exercise - search an array
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numStudent = 0;
        String[] nameStudents;
        String targetStudent;
        boolean isFound = false;

        System.out.print("How many students you want to enter: ");
        numStudent = scanner.nextInt();
        scanner.nextLine();


        nameStudents = new String[numStudent];
        for (int i = 0; i < nameStudents.length; i++){
            System.out.print("Enter the name of student number " + (i+1) + ":");
            nameStudents[i] = scanner.nextLine();
        }

        Arrays.sort(nameStudents);

        System.out.println("The name of the student/s is/are: ");
        for (String name : nameStudents){
            System.out.println(name);
        }

        System.out.print("Enter the name of the student you want to search: ");
        targetStudent = scanner.nextLine();

        for(int i = 0; i < nameStudents.length; i++){
            if(nameStudents[i].equals(targetStudent)){
                System.out.println("Yes we have a student whose name is " + targetStudent);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Sorry we don't have a student whose name is " +targetStudent);
        }

        scanner.close();
    }
}
