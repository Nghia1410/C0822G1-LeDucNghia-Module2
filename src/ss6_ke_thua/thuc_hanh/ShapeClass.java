package ss6_ke_thua.thuc_hanh;

public class ShapeClass {
    public String color = "green";
    public boolean filled = true;

    public ShapeClass() {
    }

    ;

    public ShapeClass(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "ShapeClass{" +
                "color='" + getColor() + '\'' + "and"
                + (isFilled() ? "filled" : "not filled");
    }

}

