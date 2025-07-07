import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String input = scanner.next();
        System.out.println(new StringBuilder(input).reverse());
        scanner.close();
    }
}
