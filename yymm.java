import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year and month. Press 0 to exit.");
        String s = sc.next();
        sc.close();
    

        
        String firstTwo = s.substring(0, 2);
        String lastTwo = s.substring(2, 4);

   
        int first = Integer.parseInt(firstTwo);
        int last = Integer.parseInt(lastTwo);

     
        boolean isYYMM = (1 <= last && last <= 12); 
        boolean isMMYY = (1 <= first && first <= 12); 

     
        if (isYYMM && isMMYY) {
            System.out.println("AMBIGUOUS");
        } else if (isYYMM) {
            System.out.println("YYMM");
        } else if (isMMYY) {
            System.out.println("MMYY");
        } else {
            System.out.println("NA");
        }
    }
}
