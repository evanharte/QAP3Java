package Problem4;

public interface Scalable {
  // essentially a setter function that multiplies (scales) the instance variables in each class by the factor given.
  public void scale(double factor);
  
  public static void scaleAll(Scalable[] scalables, double factor) {
    for (Scalable s : scalables) {
      s.scale(factor);
    }
  }
} 
