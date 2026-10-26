class CircleFigure implements GeometricFigure {
    private static final double PI_APPROX = 3.14;
    private final double radius;

    CircleFigure(double radius) {
        this.radius = radius;
    }

    @Override
    public String describe() {
        return "Радиус круга: " + radius;
    }

    @Override
    public double area() {
        return PI_APPROX * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI_APPROX * radius;
    }
}