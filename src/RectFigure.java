class RectFigure implements GeometricFigure {
    private final double sideA;
    private final double sideB;

    RectFigure(double width, double height) {
        this.sideA = width;
        this.sideB = height;
    }

    @Override
    public String describe() {
        return "Длина и ширина квадрата: " + sideB + ", " + sideA;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2 * (sideA + sideB);
    }
}