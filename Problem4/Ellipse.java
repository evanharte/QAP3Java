package Problem4;

public class Ellipse extends Shape {
  private double a; // major axis - longest diameter
  private double b; // minor axis - shortest diameter

  public Ellipse(String name, double a, double b) {
    super(name);
    if (a <= 0 || b <= 0) {
      throw new IllegalArgumentException("Axes must be positive");
    } else if (a < b) {
      throw new IllegalArgumentException("Major axis must be greater than minor axis");
    } else if (a == b) {
      throw new IllegalArgumentException("Major axis must be different from minor axis");
    } else {
      this.a = a;
      this.b = b;
    }
  }

  @Override
  public double getArea() {
    return Math.PI * a * b;
  }

  @Override
  public double getPerimeter() {
    return Math.PI * Math.sqrt((2 * ((this.a * this.a) + (this.b * this.b)) - ((this.a - this.b) * (this.a - this.b))/2));
  }

  @Override
  public void scale(double factor) {
    this.a *= factor;
    this.b *= factor;
  }

  @Override
  public String toString() {
    return "Ellipse: " + this.name + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
  }
}
