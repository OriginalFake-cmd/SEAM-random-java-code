

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long A = input.nextLong();
        long B = input.nextLong();
        long C = input.nextLong();
        long D = input.nextLong();

        long result = countNotDivisible(B, C, D) - countNotDivisible(A - 1, C, D);
        System.out.println(result);
    }

    static long countNotDivisible(long x, long c, long d) {
        long countC = x / c;
        long countD = x / d;
        long lcm = lcm(c, d);
        long countBoth = x / lcm;
        return x - countC - countD + countBoth;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
