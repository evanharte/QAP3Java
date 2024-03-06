public class CollegeStudent extends Student {
  protected String major;
  protected int year;

  public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
    super(name, age, gender, idNum, gpa);
    this.major = major;
    this.year = year;
  }

  // getter methods
  public String getMajor() {
    return major;
  }

  public int getYear() {
    return year;
  }

  // setter methods
  public void setMajor(String major) {
    this.major = major;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // toString method
  @Override
  public String toString() {
    return "CollegeStudent[" + super.toString() + ", " + "Major: " + major + ", " + "Year: " + year + "]";
  }
}
