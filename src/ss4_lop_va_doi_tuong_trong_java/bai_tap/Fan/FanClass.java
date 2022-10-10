package ss4_lop_va_doi_tuong_trong_java.bai_tap.Fan;

public class FanClass {
    final int SLOW = 1;
    final int MEDIUM = 1;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public FanClass() {

    }


    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        if (this.on) {
            return "FanClass{" + "fan is on " +
                    " speed= " + speed +
                    " radius= " + radius +
                    " color= " + color + '\'' +
                    '}';
        } else {
            return "fan is off " +
                    "color= " + color +
                    "radius= " + radius;

        }

    }
}
