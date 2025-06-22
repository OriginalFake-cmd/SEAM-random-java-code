import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean same = false;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                same = true;
                break;
            }
        }
        if (same) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
        sc.close();
    }
}
