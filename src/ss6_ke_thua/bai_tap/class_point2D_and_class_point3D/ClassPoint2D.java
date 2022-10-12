package ss6_ke_thua.bai_tap.class_point2D_and_class_point3D;

public class ClassPoint2D {
    private float x;
    private float y;

    public ClassPoint2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public ClassPoint2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    public String toString() {
        return x + "," + y;
    }
}
