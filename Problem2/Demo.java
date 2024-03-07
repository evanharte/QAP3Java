package Problem2;

public class Demo {
  public static void main(String[] args) {
    MovablePoint p1 = new MovablePoint(1, 2, 3, 4);
    System.out.println();

    System.out.println(p1);
    
    p1.move();

    System.out.println();
    System.out.println(p1);
    System.out.println();

    p1.setSpeed(5, 6);
    p1.move();

    System.out.println(p1);
    System.out.println();
  }
}
