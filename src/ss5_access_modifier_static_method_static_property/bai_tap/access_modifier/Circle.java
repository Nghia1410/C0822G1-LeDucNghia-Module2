package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {
    private static double radius = 1.0;
    private static String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
    }

    public static double getRadius() {
        return radius;
    }

    public static double getArea() {
        return radius * radius * Math.PI;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static void setColor(String color) {
        Circle.color = color;
    }

    public String toString() {
        return radius + " + " + color + " + " + getArea();
    }
}
