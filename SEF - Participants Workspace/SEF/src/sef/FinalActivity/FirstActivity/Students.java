package FirstActivity;

public class Students extends Person {
    private String schoolName;
    private String name;

    public Students() {
        System.out.println("I am studying in university " + schoolName);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getName() {
        return name;
    }
    public void getName(String name) {
        this.name = name;
    }
}
