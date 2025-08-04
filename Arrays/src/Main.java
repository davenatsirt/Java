/*
*   Arrays with using the enhanced for loops, sorting method
*   Think of array as a variable that can store more than 1 value
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //Sort the array alphabetically
        Arrays.sort(days);
        //
        Arrays.fill(days, "Saturday");

        //to get the length of the array
        System.out.println(days.length);
        for(String day : days){
            System.out.println(day);
        }
    }
}
