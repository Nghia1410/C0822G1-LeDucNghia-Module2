package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class StudentMain {
    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass();
        StudentClass.setName("Lê Đức Nghĩa");
        StudentClass.setMyclass("C0822G1");
        System.out.println(studentClass.toString());
    }
}
