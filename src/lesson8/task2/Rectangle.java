package lesson8.task2;

public class Rectangle extends Figure {
    private double length;

    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        length = 15;
        width = 7.5;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        double area = length * width;
        System.out.println("Area of rectangle = " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = (width + length) * 2;
        System.out.println("Perimeter of rectangle = " + perimeter);
    }
}
