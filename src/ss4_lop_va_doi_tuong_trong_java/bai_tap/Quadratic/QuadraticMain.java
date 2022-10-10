package ss4_lop_va_doi_tuong_trong_java.bai_tap.Quadratic;

import ss4_lop_va_doi_tuong_trong_java.bai_tap.Quadratic.QuadraticClass;

import java.util.Scanner;

public class QuadraticMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a = scanner.nextDouble();
        System.out.println("nhập b");
        double b = scanner.nextDouble();
        System.out.println("nhập c");
        double c = scanner.nextDouble();
        QuadraticClass quadraticClass = new QuadraticClass(a, b, c);
        System.out.println("tham số vừa nhập là :" + quadraticClass.display());
        if (quadraticClass.getDiscriminant() == 0) {
            System.out.println("phương trình có hai nghiệm : x1 = x2 = " + quadraticClass.getRoot1());
        } else if (quadraticClass.getDiscriminant() >= 0) {
            System.out.println("phương trình có hai nghiệm kép:x1= " + quadraticClass.getRoot1() + "\n" + "x2= " + quadraticClass.getRoot2());
        } else {
            System.out.println("The equation has no roots”");
        }
    }
}
