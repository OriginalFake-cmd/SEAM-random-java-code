import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] numbers = {"8", "1", "2", "4", "5", "6", "7"};
    Arrays.sort(numbers);
    for (String i : numbers) {
      System.out.println(i);
    }
  }
}
