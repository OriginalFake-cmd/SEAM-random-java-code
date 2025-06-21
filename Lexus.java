//filename: Main.java
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(2025, "Lexus");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
