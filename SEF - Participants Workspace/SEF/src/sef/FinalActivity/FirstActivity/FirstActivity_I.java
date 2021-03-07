package FirstActivity;

import java.util.Arrays;
import java.util.Comparator;

class FirstActivity_I {

    private String name;
    private int age;
    private String jobTitle;
    private String company;
    private double salary;

    public FirstActivity_I(String name, int age, String jobTitle, String company, double salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    static FirstActivity_I e1 = new FirstActivity_I("Anne Hahn", 35, "Manager", "P&G", 3000);
    static FirstActivity_I e2 = new FirstActivity_I("Brandon Shaw", 23, "Baker", "Laduree", 2000);
    static FirstActivity_I e3 = new FirstActivity_I("Ciara Johnson", 25, "Tutor", "Middle School", 1000);
    static FirstActivity_I e4 = new FirstActivity_I("Dan Warren", 31, "Analyst", "PwC", 3500);
    static FirstActivity_I[] emp = {e1, e2, e3, e4};

    public static void main(String[] args) {
        sortBySalaryAsc();
        System.out.println("----------------------");
    }

    public static void sortBySalaryAsc() {
        Arrays.sort(emp, Comparator.comparing(FirstActivity_I::getSalary).reversed());
        System.out.println("Salary sorted from high to low:");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].name+" - "+emp[i].salary+" EUR");
        }
    }
}