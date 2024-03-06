package Problem1;
public class Teacher extends Person {
  protected String subject;
  protected double salary;

  public Teacher(String name, int age, String gender, String subject, double salary) {
    super(name, age, gender);
    this.subject = subject;
    this.salary = salary;
  }

  // getter methods
  public String getSubject() {
    return subject;
  }

  public double getSalary() {
    return salary;
  }

  // setter methods
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  //toString method
  @Override
  public String toString() {
    return "Teacher(" + super.toString() + ", " + "Subject: " + subject + ", " + "Salary: $" + salary + ")";
  }
}
