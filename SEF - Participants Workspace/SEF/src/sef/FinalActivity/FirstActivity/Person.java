package FirstActivity;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
    }
    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void Person() {
        System.out.println("My name is " + firstName + " " + lastName + " and I am " + age + " years old");
    }

    public static void main(String arg[]) {
        Person h = new Person();
        h.setFirstName("Helen");
        h.setLastName("Bow");
        h.setAge(27);
        h.Person();
    }
}

