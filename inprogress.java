import java.util.Scanner;

public class CashRegisterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which item would you like to purchase? These are the available items: Hot Wheels Mainlines, Hot Wheels Premium, Candy Bar, Lego Minifigures");
        
        double hotWheelsMainlinesPrice = 1.25;
        double hotWheelsPremiumPrice = 6.00;
        double candyBarPrice = 2.50;
        double legoMinifiguresPrice = 5.00;
        
        String input = scanner.nextLine();
        
        double finaltotal = 0;
        double cashowed = 0;
        
        if (input.equalsIgnoreCase("Hot Wheels Mainlines")) {
            finaltotal = hotWheelsMainlinesPrice;
            System.out.println("Hot Wheels Mainlines = $" + hotWheelsMainlinesPrice);
            System.out.println("Enter the amount paid:");
            double cash = scanner.nextDouble();
            cashowed = cash - finaltotal;
            System.out.printf("CHANGE OWED: $%.2f%n", cashowed);
        } 
        
        else if (input.equalsIgnoreCase("Hot Wheels Premium")) {
            finaltotal = hotWheelsPremiumPrice;
            System.out.println("Hot Wheels Premium = $" + hotWheelsPremiumPrice);
            System.out.println("Enter the amount paid:");
            double cash = scanner.nextDouble();
            cashowed = cash - finaltotal;
            System.out.printf("CHANGE OWED: $%.2f%n", cashowed);
        } 
        
        else if (input.equalsIgnoreCase("Candy Bar")) {
            finaltotal = candyBarPrice;
            System.out.println("Candy Bar = $" + candyBarPrice);
            System.out.println("Enter the amount paid:");
            double cash = scanner.nextDouble();
            cashowed = cash - finaltotal;
            System.out.printf("CHANGE OWED: $%.2f%n", candyBarPrice);
        } 
        
        else if (input.equalsIgnoreCase("Lego Minifigures")) {
            finaltotal = legoMinifiguresPrice;
            System.out.println("Lego Minifigures = $" + legoMinifiguresPrice);
            System.out.println("Enter the amount paid:");
            double cash = scanner.nextDouble();
            cashowed = cash - finaltotal;
            System.out.printf("CHANGE OWED: $%.2f%n", cashowed);
        } 
        
        else {
            System.out.println("Invalid item selected. Please choose from the available items.");
        }
        
        scanner.close();
    }
}
