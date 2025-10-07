
import java.util.Scanner;
public class Robot {
    int Wheels;
    double Power;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter power usage:");
    double Power = scanner.nextLine();
    System.out.println("Usage is: " + Power);

    public Robot(int Wheels, double Power) {
        this.Wheels = Wheels;
        this.Power = Power;
    }

    public int getWheels() { return Wheels; }
    public double getPower() { return Power; }

    public void setWheels(int Wheels) { this.Wheels = Wheels; }
    public void setPower(double Power) { this.Power = Power; }

    public void Random() {
        System.out.println("The robot has: " + Wheels + " wheels.");
        System.out.println("Sending " + Power +"%" + " power.");
    }

    public static void main(String[] args) {
        Robot bot = new Robot(4, 100.0);
        bot.Random();
    }
}
