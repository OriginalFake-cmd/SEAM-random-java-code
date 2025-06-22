import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Please enter four integers: ");

        try {
            System.out.print("Enter a: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid integer. Please try again.");
                sc.next(); 
            }
            a = sc.nextInt();

            System.out.print("Enter b: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid integer. Please try again.");
                sc.next(); 
            }
            b = sc.nextInt();

            System.out.print("Enter c: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid integer. Please try again.");
                sc.next();
            }
            c = sc.nextInt();

            System.out.print("Enter d: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid integer. Please try again.");
                sc.next(); 
            }
            d = sc.nextInt();

            int ans = b - a + 1;

            for (int i = a; i <= b; i++) {
                if (i % c == 0 || i % d == 0) {
                    ans--;
                }
            }

            System.out.println("Result: " + ans);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
