package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CylinderClass extends CircleClass {
    private double height;

    public CylinderClass(double height) {
        this.height = height;
    }

    public CylinderClass() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getvolumn() {
        return getArea() * this.height;
    }

    public CylinderClass(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public String toString() {
        return "Volumn: " + getvolumn() + ", " + super.toString();
    }
}
