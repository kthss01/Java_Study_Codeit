package intermediate.interface_practice;

public class Circle implements Shape{
    // 원주율
    public final double PI = 3.14;

    // 반지름
    double radius;

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
