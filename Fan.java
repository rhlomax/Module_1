/**
  Fan.java
  August, 2022
  Rich Lomax
  Bellevue Unviersity.
  Module 1 Assignment.
  A class to implement a Fan object that has several attributes.
 **/
public class Fan {
  // Constants for the speed attribute:
  static final int STOPPED = 0;
  static final int SLOW = 1;
  static final int MEDIUM = 2;
  static final int FAST = 3;
  static final String TEMPLATE1 = "The fan is %s with a radius of %2.2f and the fan is off";
  static final String TEMPLATE2 = "The fan speed is set to %d with a color of %s and a radius of %2.2f";
  // attributes for speed, on/off, radius, and color:
  private int speed;
  private boolean on;
  private double radius;
  private String color;
  
  /* The no-argument constructor: */
  public Fan() {
    // Call the super constructor:
    super();
    // Set the attributes to their default values
    setSpeed(STOPPED);
    setOn(false);
    setRadius(6.0);
    setColor("White");
  }
  /* A specific constructor: */
  public Fan(int speed, boolean on, double radius, String color) {
    super();
    setSpeed(speed);
    setOn(on);
    setRadius(radius);
    setColor(color);
  }
  
  /**
   * Accessor method for the speed attribute
   * @return the value of the speed attribute
   */
  public int getSpeed() {
    return this.speed;
  }
  /**
   * Accessor method for the on attribute
   * @return the value of the on attribute
   */
  public boolean isOn() {
    return this.on;
  }
  /**
   * Accessor method for the radius attribute
   * @return the value of the radius attribute
   */
  public double getRadius() {
    return this.radius;
  }
  /**
   * Accessor method for the color attribute
   * @return the value of the color attribute
   */
  public String getColor() {
    return this.color;
  }
  /**
   * Mutator method for the speed attribute
   * @param speed int
   */
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  /**
   * Mutator method for the on attribute
   * @param on boolean
   */
  public void setOn(boolean on) {
    this.on = on;
  }
  /**
   * Mutator method for the radius attribute
   * @param radius double
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }
  /**
   * Mutator method for the color attribute
   * @param color String
   */
  public void setColor(String color) {
    this.color = color;
  }
  
  /**
   * override of the toString method for this class:
   */
  @Override
  public String toString() {
    if (this.isOn()) {
      return String.format(TEMPLATE2, this.getSpeed(), this.getColor(), this.getRadius());
    }
    else {
      return String.format(TEMPLATE1, this.getColor(), this.getRadius());
    }
  }
  
}
