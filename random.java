import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        welcome();
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        double[] scores = new double[3];
        for (int i = 0; i < 3; i++) {
            scores[i] = readScore(scanner, i + 1);
        }

        double average = calculateAverage(scores);
        printResult(name, average);
        
        scanner.close();
    }

    static void welcome() {
        System.out.println("Welcome to the Test Score Average Calculator!");
    }

    static double readScore(Scanner scanner, int testNumber) {
        System.out.print("Enter score for test " + testNumber + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }

    static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    static boolean didPass(double average) {
        return average >= 60; 
    }

    static void printResult(String name, double average) {
        System.out.printf("%s, your average score is %.2f.%n", name, average);
        if (didPass(average)) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("Unfortunately, you did not pass.");
        }
    }
}
