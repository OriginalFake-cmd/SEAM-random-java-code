import java.util.Scanner;
public class myapp {
    static double x;
    static double y;
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        double o = calculator.add(x,y);
        double q = calculator.subtract(x,y);
        double c = calculator.multiply(x,y);
        double r = calculator.divide(x,y);
    }

}

