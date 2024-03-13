package Problem3;

public class EquilateralTriangle extends Shape {
  private double side;

  public EquilateralTriangle(String name, double side) {
    super(name);
    if (side <= 0) {
      throw new IllegalArgumentException("Side must be positive");
    } else {
      this.side = side;
    }
  }

  @Override
  public double getArea() {
    return (Math.sqrt(3) / 4) * this.side * this.side;
  }

  @Override
  public double getPerimeter() {
    return this.side + this.side + this.side;
  }

  @Override
  public String toString() {
    return "Equilateral Triangle: " + this.name + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
  }
}
