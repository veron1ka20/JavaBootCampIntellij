package FirstActivity;

public class Student extends Person {
    private String schoolName;

    public Student() {
        this.schoolName = "Unknown";
    }


    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void Student() {
        System.out.println("I am studying in " + schoolName + " University."); }

    public static void main(String[] args) {
        Student s = new Student();
        s.setSchoolName("Columbia");
        s.Student();
    }
}