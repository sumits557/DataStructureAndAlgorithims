package src.main.java.circlecalculation;

public class Circle {

    private double radius;

    public Circle(double r) {
        if (r < 0)
            throw new RuntimeException("Radius can't be in -ve");
        this.radius = r;
    }

    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double findPerimeter() {
        return Math.PI * 2 * this.radius;
    }
}
