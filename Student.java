public class Student extends Person {
  protected String myIdNum;
  protected double myGPA;

  public Student(String name, int age, String gender, String idNum, double gpa) {
    super(name, age, gender);
    this.myIdNum = idNum;
    this.myGPA = gpa;
  }

  public String getIdNum() {
    return myIdNum;
  }

  public double getGPA() {
    return myGPA;
  }

  public void setIdNum(String idNum) {
    this.myIdNum = idNum;
  }

  public void setGPA(double gpa) {
    this.myGPA = gpa;
  }

  @Override
  public String toString() {
    return "Student(" + super.toString() + ", " + myIdNum + ", " + myGPA + ")";
  }
}
