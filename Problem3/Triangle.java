package Problem3;

public class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;

  public Triangle(String name, double side1, double side2, double side3) {
    super(name);

    if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } else {
      throw new IllegalArgumentException("Invalid triangle sides");
    }
  }

  @Override
  public double getArea() {
    double s = (this.side1 + this.side2 + this.side3) / 2;
    return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
  }

  @Override
  public double getPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  @Override
  public String toString() {
    return "Triangle: " + this.name + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
  }
}
