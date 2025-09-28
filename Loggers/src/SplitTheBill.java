// Import the package containing Java's logging capability
import java.util.logging.*;

public class SplitTheBill {

    // Get a logger object named for the class
    private static Logger logger = Logger.getLogger("SplitTheBill");

    public static void main(String[] args) {
        computeEachBill(150, 5);
        computeEachBill(100, 0);
    }

    public static void computeEachBill(int bill, int people){
        try{
            int each = bill/people;
            // Add a logger entry, at INFO level, with the bill for each person
            logger.log(Level.INFO, "Bill for each person is equal to: " + each);
        }catch(ArithmeticException e){
            // Add a log entry, at SEVERE level, that the people splitting must be positive
            logger.log(Level.SEVERE, "You forgot to provide a positive number of people for splitting: " + bill);
        }
    }

}
