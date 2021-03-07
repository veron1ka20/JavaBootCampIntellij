package FirstActivity;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private String name;
    private int age;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.age = 0;
        this.jobTitle = "Unknown";
        this.company = "Unknown";
        this.salary = 0;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void Employee() {
        System.out.println("My name is " + name + " and I am " + age + " years old " + " and I work as " + jobTitle + " in " + company); }

    public static void main(String[] args) {
        Employee m = new Employee();
        m.setName("Miriam Brown");
        m.setAge(31);
        m.setJobTitle("Assistant");
        m.setSalary(3000);
        m.setCompany("White House");
        m.Employee();
    }
}
