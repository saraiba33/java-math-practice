import java.util.Random;

public class MathApp {
  public static void main(String[] args) {

    double job1Salary = 42340.12;
    double job2Salary = 51015.43;
    double whichIsHigher = Math.max(job1Salary, job2Salary);
    System.out.println("This is the best salary: $" + whichIsHigher);

    int carPrice = 28000;
    int truckPrice = 45000;
    int whichIsLower = Math.min(carPrice, truckPrice);
    System.out.println("This is the lowest price: $" + whichIsLower);

    double radiusSquared = 7.25 * 7.25;
    double area = Math.PI * radiusSquared;
    System.out.println("The area of the circle is: " + String.format("%.2f", area));

    double num1 = 5.0;
    double squareRoot = Math.sqrt(num1);
    System.out.println(String.format("%.2f", squareRoot));

    int x1 = 5;
    int y1 = 10;
    int x2 = 85;
    int y2 = 50;
    double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    System.out.println("The distance between is " + String.format("%.2f", distance));

    double num2 = -3.8;
    System.out.println(Math.abs(num2));

    Random random = new Random();
    int randomNumber = random.nextInt(10);
    System.out.println("A random number " + randomNumber);

  }
}
