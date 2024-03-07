package Problem2;

public class MovablePoint extends Point {
  private float xSpeed;
  private float ySpeed;

  public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MovablePoint(float xSpeed, float ySpeed) {
    super();
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MovablePoint() {
    super();
    this.xSpeed = 0.0f;
    this.ySpeed = 0.0f;
  }

  // getter methods
  public float getXSpeed() {
    return this.xSpeed;
  }

  public float getYSpeed() {
    return this.ySpeed;
  }

  public float[] getSpeed() {
    final float[] speed = {this.xSpeed, this.ySpeed};
    return speed;
  }

  // setter methods
  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }

  public void setSpeed(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  // toString() method
  @Override
  public String toString() {
    return super.toString() + "," + "speed=(" + this.xSpeed + "," + this.ySpeed + ")";
  }

  // move() method
  public MovablePoint move() {
    setX(getX() + this.xSpeed);
    setY(getY() + this.ySpeed);
    return this;
  }
}
