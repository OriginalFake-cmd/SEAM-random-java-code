import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            t--;
            int n = scanner.nextInt();
            int[] a1 = new int[n];
            int[] a2 = new int[n];
            int[] a3 = new int[n];

            for (int i = 0; i < n; i++) {
                a1[i] = scanner.nextInt();
                a2[i] = a1[i];
                a3[i] = a1[i];
            }

            for (int i = 0; i < n; i += 2) {
                a2[i]++;
            }

            for (int i = 0; i < n; i += 2) {
                a3[i]++;
            }

            boolean allOdd = true;
            boolean allEven = true;

            for (int i = 0; i < n; i++) {
                if (a1[i] % 2 == 0) {
                    allOdd = false;
                } else {
                    allEven = false;
                }
            }


            if (allOdd || allEven) {
                System.out.print("Yay");
            }
        }
        
    }
}
