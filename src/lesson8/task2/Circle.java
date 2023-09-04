package lesson8.task2;

public class Circle extends Figure{
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 5.4f;
    }

    @Override
    public void getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle = " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle = " + perimeter);
    }
}
