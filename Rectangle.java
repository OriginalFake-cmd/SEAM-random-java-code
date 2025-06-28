import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Enter length:");
    double length = scanner.nextDouble();

    System.out.println("Enter width");
    double width =  scanner.nextDouble();
    double area = length * width;
    System.out.println("Enter length:");
    System.out.println("Enter width:");
    System.out.println(area);
    }
  }
  
