import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Радиус круга: ");
        double r = sc.nextDouble();

        System.out.print("Ширина прямоугольника: ");
        double w = sc.nextDouble();
        System.out.print("Высота прямоугольника: ");
        double h = sc.nextDouble();

        System.out.print("Сторона 1 треугольника: ");
        double a = sc.nextDouble();
        System.out.print("Сторона 2 треугольника: ");
        double b = sc.nextDouble();
        System.out.print("Сторона 3 треугольника: ");
        double c = sc.nextDouble();

        GeometricFigure[] figures = {
                new CircleFigure(r),
                new RectFigure(w, h),
                new TriangleFigure(a, b, c)
        };

        for (GeometricFigure figure : figures) {
            System.out.println(figure.describe());
        }

        System.out.printf("Суммарная площадь фигур: %.2f\n",
                FigureCalculator.totalArea(figures));
        System.out.printf("Суммарный периметр фигур: %.2f\n",
                FigureCalculator.totalPerimeter(figures));
    }
}