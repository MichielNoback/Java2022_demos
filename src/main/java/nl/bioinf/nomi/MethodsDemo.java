package nl.bioinf.nomi;

public class MethodsDemo {

    public double getTriangleSurface(double height, double width) {
        return 0.5 * height * width;
    }

    public double getTriangleSurface(double side) {
        return getTriangleSurface(side, side);
    }

    public double getPower(double x, int power) {
        return Math.pow(x, power);
    }

    public double getPower(double x) {
        return Math.pow(x, 2);
    }
}
