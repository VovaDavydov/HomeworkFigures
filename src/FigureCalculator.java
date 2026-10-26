class FigureCalculator {
    static double totalArea(GeometricFigure... figures) {
        double sum = 0;
        for (GeometricFigure figure : figures) {
            sum += figure.area();
        }
        return sum;
    }

    static double totalPerimeter(GeometricFigure... figures) {
        double sum = 0;
        for (GeometricFigure figure : figures) {
            sum += figure.perimeter();
        }
        return sum;
    }
}