package Shapes;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }
}
