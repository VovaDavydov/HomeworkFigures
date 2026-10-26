class TriangleFigure implements GeometricFigure {
    private final double side1;
    private final double side2;
    private final double side3;

    TriangleFigure(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String describe() {
        return "Стороны треугольника: " + side1 + ", " + side2 + ", " + side3;
    }

    @Override
    public double area() {
        double semiperimeter = perimeter() / 2;
        return Math.sqrt(
                semiperimeter
                        * (semiperimeter - side1)
                        * (semiperimeter - side2)
                        * (semiperimeter - side3)
        );
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}