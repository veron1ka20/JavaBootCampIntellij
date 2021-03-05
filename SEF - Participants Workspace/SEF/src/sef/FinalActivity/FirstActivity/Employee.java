package FirstActivity;

public class Employee extends Person {
    private String title;
    private String company;
    private String name;
    private String age;

    public Employee(){
        super();
        System.out.println("My name is " + name + " and I am " + age + " years old " + " and I work as " + title + " in " + company); }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

}