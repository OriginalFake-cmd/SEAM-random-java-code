import java.util.Scanner;
import java.lang.Math;

class TableCloth {
    
        void printType()
        {
             System.out.println("tablecloth");
        }
}

public class CashRegister {

    private static final double PENNIES = 0.01;
    private static final double NICKELS = 0.05;
    private static final double DIMES = 0.10;
    private static final double QUARTERS = 0.25;
    private static final double DOLLARS = 1.00;
    private static final double FIVES = 5.00;
    private static final double TENS = 10.00;
    private static final double TWENTIES = 20.00;
    private static final double FIFTIES = 50.00;
    private static final double HUNDREDS = 100.00;
    double price;
   static TableCloth beigePlantTableCloth = new TableCloth();

    public static void main(String[] args) {
        
        beigePlantTableCloth.printType();
        Scanner input = new Scanner(System.in);

        int pennies, nickels, dimes, quarters, ones, fives, tens, twenties;
        double cash, finaltotal, cashowed; 

        List();
        System.out.print(  "Enter the total cost of the purchase: ");
        finaltotal = input.nextDouble();

        
        System.out.print( "Enter amount of cash given: ");
        cash = input.nextDouble();

        
        cashowed = cash - finaltotal;
        System.out.printf( "CHANGE OWED: %.2f%n", cashowed);

       
        calculateChange(cashowed);
    }

    public static void List() {
        System.out.println("Currency: " + PENNIES + ", " + NICKELS + ", " + DIMES + ", " + QUARTERS + ", " + 
        DOLLARS + ", " + FIVES + ", " + TENS + ", " + TWENTIES + ", " + FIFTIES + ", " + HUNDREDS);
    }

    public static void calculateChange(double cashowed) {
      
    }
}
