package activity;

public class AbstractionActivity {
    public static void main(String[] args)
    {
        // Rectangle
        double breadth = 6, length = 5;
        Shape rectangle = new Rectangle(breadth, length);
        System.out.println("The rectangle area is: " + rectangle.calculateArea()
                + "and the perimeter is: " + rectangle.calculatePerimeter() + ".");
        // Circle
        double side = 5;
        Shape circle = new Circle(side);
        System.out.println("The area of the circle is: " + circle.calculateArea()
                + "and the perimeter is: " + circle.calculatePerimeter() + ".");


    }
}

