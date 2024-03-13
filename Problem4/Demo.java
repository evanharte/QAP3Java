package Problem4;

public class Demo {
  public static void main(String[] args) {
    // Create an array of Scalable objects
    Scalable[] shapes = new Scalable[4];

    // Create Scalable objects
    shapes[0] = new Circle("c1", 4);
    shapes[1] = new Ellipse("e1", 5, 2.5);
    shapes[2] = new Triangle("t1", 7, 8, 9);
    shapes[3] = new EquilateralTriangle("et1", 7.9);

    // Print the objects before scaling
    System.out.println();
    System.out.println("Before scaling:");
    for (Scalable s : shapes) {
      System.out.println();
      System.out.println(s.toString());
    }
    System.out.println();

    // add a static method (to Scalable.java?) that receives an array of Type Scalable, and a scale factor. This method should visit all the elements of the Scalable array and call the scale method with the scale factor passed to the static method.
    Scalable.scaleAll(shapes, 2.0);
    

    // Print the objects after scaling
    System.out.println("After scaling:");
    for (Scalable s : shapes) {
      System.out.println();
      System.out.println(s.toString());
    } 

    System.out.println();
  }
}
