import java.math.BigDecimal;

public class SplitTheBill {
    public static void main(String[] args) {
        BigDecimal bill = new  BigDecimal("125.5");
        computeEachBill(bill, 5);
        computeEachBill(bill, 0);
    }

    public static void computeEachBill(BigDecimal bill, int people) {
        BigDecimal individualBill = new BigDecimal(0);
        BigDecimal numPeople = new BigDecimal(people);
        //try
        try{
            individualBill = bill.divide(numPeople);
        } catch(ArithmeticException e){
            System.out.println("You did not provide a positive number of people to split the bill");
            numPeople = new BigDecimal(2);
            individualBill = bill.divide(numPeople);
        } finally{
            System.out.println("Bill for each of " + numPeople + " is " + individualBill);
        }
    }
}
