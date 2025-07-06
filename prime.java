import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int num;
        System.out.print("Enter the number:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        
        if (num <= 1) {
            System.out.println(""+num+" is not a prime number.");
            return; 
        }

       
        for (int j = 2; j < num; j++) {
       
            if (num % j == 0) {
                System.out.println(""+num+" is not a prime number.");
                return; 
            }
        }

        
        System.out.println(""+num+" is a prime number.");
    }
}
