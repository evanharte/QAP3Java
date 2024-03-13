package Problem3;

public class Demo {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[4];
    shapes[0] = new Circle("c1", 4);
    shapes[1] = new Ellipse("e1", 5, 2.5);
    shapes[2] = new Triangle("t1", 7, 8, 9);
    shapes[3] = new EquilateralTriangle("et1", 7.9);

    for (Shape s : shapes) {
      System.out.println();
      System.out.println(s.toString());
    }
    System.out.println();
  }
}
