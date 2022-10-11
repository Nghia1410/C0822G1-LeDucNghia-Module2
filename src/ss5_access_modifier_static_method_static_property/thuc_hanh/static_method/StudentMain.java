package ss5_access_modifier_static_method_static_property.thuc_hanh.static_method;

public class StudentMain {
    public static void main(String[] args) {
        StudentClass.change();
        StudentClass s1=new StudentClass(111,"Hoang");
        StudentClass s2=new StudentClass(222,"Hoanh");
        StudentClass s3=new StudentClass(333,"Hoa");
        s1.display();
        s2.display();
        s3.display();
    }
}
