package intermediate.interface_practice;

public class Square implements Shape{
    // 길이
    public final double side;

    // 생성자
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
