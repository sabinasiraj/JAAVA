package graphics;

public class Triangle implements GraphicsTriangle {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double perimeter() {
        return 0;
    }

    public double area() {
        return 0.5 * base * height;
    }
}
