package ss6_ke_thua.bai_tap.class_point2D_and_class_point3D;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        ClassPoint2D classPoint2D =new ClassPoint2D();
        classPoint2D.setX(2);
        classPoint2D.setY(7);

        ClassPoint3D classPoint3D = new ClassPoint3D();
        classPoint3D.setX(2);
        classPoint3D.setY(3);
        classPoint3D.setZ(5);
        System.out.println(classPoint3D.toString());
        System.out.println(Arrays.toString(classPoint2D.getXY()));
        System.out.println(Arrays.toString(classPoint3D.getXYZ()));

    }
}
