package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle.setColor("green");
        Circle.setRadius(3);
        System.out.println(circle.toString());

    }
}
