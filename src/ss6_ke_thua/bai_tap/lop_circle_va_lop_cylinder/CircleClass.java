package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CircleClass {
    private double radius;
    private String color;

    public CircleClass() {
    }

    public CircleClass(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "radius=" + radius + ", color=' " + color + ", Area: " + getArea();
    }
}


