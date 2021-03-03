package activity;

public class Circle extends Shape {
    private double side;
    final double pi = Math.PI;

    public Circle() {
        this.side = 1;
    }

    public Circle(double side) {
        this.side = side;
    }

    public double calculateArea()
    {
        return(pi*Math.pow(side,2));
    }
    public double calculatePerimeter()
    {return (2*pi*side);}


}
