package graphics;

public class Rectangle implements GraphicsRect {
    double l, b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }

    public double perimeter() {
        return 2 * (l + b);
    }
}
