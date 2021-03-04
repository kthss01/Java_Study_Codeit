package intermediate.abstract_practice;

public class Rectangle extends Shape {
    // 길이
    public final double side1;
    public final double side2;

    // 생성자

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }
}
