/**
 * TestFanApp.java
 * Rich Lomax
 * CIS 505
 * August, 2022
 * A class to test the Fan class
 */
 
public class TestFanApp {
  /* override the default constructor: */
  public TestFanApp() {
  }
  
  /*
   * Method to implement the tests: 
   */
  public void testTheFans() {
    // Create a fan with the defaults:
    Fan fan1 = new Fan();
    // Create a fan with specific values:
    Fan fan2 = new Fan(Fan.MEDIUM, true, 8.0, "Silver");
    // Print the fans using their toString methods:
    System.out.printf("%s\n%s\n", fan1, fan2);
  }
  /*
   * Main method
   */
  public static void main(String[] args) {
    TestFanApp tester = new TestFanApp();
    tester.testTheFans();
    System.exit(0);
  }
}