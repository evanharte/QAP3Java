package Problem2;

public class Point {
  private float x;
  private float y;

  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
    this.x = 0.0f;
    this.y = 0.0f;
  }

  // getter methods
  public float getX() {
    return this.x;
  }

  public float getY() {
    return this.y;
  }

  public float[] getXY() {
    final float[] xy = {this.x, this.y};
    return xy;
  }

  // setter methods
  public void setX(float x) {
    this.x = x;
  }

  public void setY(float y) {
    this.y = y;
  }

  public void setXY(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }
}
