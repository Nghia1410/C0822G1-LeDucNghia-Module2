package ss4_lop_va_doi_tuong_trong_java.bai_tap.Fan;

public class FanMain {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        FanClass fan2 = new FanClass();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan1 + " + " + fan2);
    }


}
