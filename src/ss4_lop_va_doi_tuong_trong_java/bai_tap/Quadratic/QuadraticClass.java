package ss4_lop_va_doi_tuong_trong_java.bai_tap.Quadratic;

public class QuadraticClass {
    private double a, b, c;

    public QuadraticClass() {
    }

    public QuadraticClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        return (-this.b - Math.sqrt(delta)) / (2 * this.a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        return (-this.b + Math.sqrt(delta)) / (2 * this.a);
    }

    public String display() {
        return "a " + a + " ,b " + b + " ,c " + c;
    }
}
