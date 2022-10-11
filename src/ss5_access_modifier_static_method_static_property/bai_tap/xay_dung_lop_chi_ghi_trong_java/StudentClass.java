package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class StudentClass {
    private static String name = "john";
    private static String myclass = "C02";

    public StudentClass() {
    }

    public static void setMyclass(String myclass) {
        StudentClass.myclass = myclass;
    }

    public static void setName(String name) {
        StudentClass.name = name;
    }


    public String toString() {
        return name + " + " + myclass;
    }
}
