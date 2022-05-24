public class MathApp {
  public static void main(String[] args) {
    System.out.println("The best salary is $" + compareSalary(43021.23, 60790.56));
    System.out.println("The lowest vehicle price $" + compareCarPrice(23450, 45089));
    System.out.println("The area of the circle is " + String.format("%.2f", areaOfCircle(7.25)));
    System.out.println("The squareroot is " + String.format("%.2f", squareRoot(5.0)));
    System.out.println("The distance between is " + String.format("%.2f", findTheDistance(5, 85, 10, 50)));
    System.out.println("The absolute number is " + absoluteNumber(-3.8));
    System.out.println("Random number between 0 & 1: " + String.format("%.2f", randomNumber()));

  }

  private static double compareSalary(double job1Salary, double job2Salary) {
    return Math.max(job1Salary, job2Salary);
  }

  private static int compareCarPrice(int carPrice, int truckPrice) {
    return Math.min(carPrice, truckPrice);

  }

  private static double areaOfCircle(double radius) {
    double radiusSquared = radius * radius;
    return Math.PI * radiusSquared;
  }

  private static double squareRoot(double num1) {
    return Math.sqrt(num1);
  }

  private static double findTheDistance(int x1, int x2, int y1, int y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }

  private static double absoluteNumber(double num2) {
    return Math.abs(num2);

  }

  private static double randomNumber() {
    return Math.random();

  }
}
