package ss6_ke_thua.bai_tap.class_point2D_and_class_point3D;

public class ClassPoint3D extends ClassPoint2D {
    private float z;

    public ClassPoint3D() {
    }

    public ClassPoint3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        this.getX();
        this.getY();
    }

    public float[] getXYZ() {
        float[] array = {this.getX(), this.getY(), this.z};
        return array;
    }

    public String toString() {
        return "("+super.toString() + "," + z + " )";

    }
}
