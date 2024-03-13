package Problem3;

public class Circle extends Shape {
  private double radius;

  public Circle(String name, double radius) {
    super(name);
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be positive");
    } else {
      this.radius = radius;
    }
  }

  @Override
  public double getArea() {
    return Math.PI * this.radius * this.radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * this.radius;
  }

  @Override
  public String toString() {
    return "Circle: " + this.name + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
  }
}
