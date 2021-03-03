package activity;

public class Rectangle extends Shape
{
    private double breadth, length;
    public Rectangle()
    {
        this.breadth = 1;
        this.length = 1;
    }
    public Rectangle(double breadth, double length)
    {
        this.breadth = breadth;
        this.length = length;
    }

    public double calculateArea()
    {
        return breadth * length;
    }

    public double calculatePerimeter()
    {
        return 2 * (breadth + length);
    }

}

