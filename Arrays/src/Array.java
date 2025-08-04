import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int userFood;

        System.out.println("Enter the number of food you choose: ");
        userFood = scanner.nextInt();
        //clear the buffer
        scanner.nextLine();

        foods = new String[userFood];

        for(int i = 0; i < foods.length; i++){
            System.out.println("Enter foods: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}

