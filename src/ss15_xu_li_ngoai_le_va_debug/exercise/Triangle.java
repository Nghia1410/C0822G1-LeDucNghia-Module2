package ss15_xu_li_ngoai_le_va_debug.exercise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        do {
            double size1, size2, size3;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập độ dài cạnh thứ nhất: ");
                size1 = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập độ dài cạnh thứ hai ");
                size2 = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập độ dài cạnh thứ ba: ");
                size3 = Double.parseDouble(scanner.nextLine());
                triangleCheck(size1, size2, size3);
                if (size1 + size2 >= size3 || size3 + size2 >= size1 || size3 + size1 >= size2) {
                    break;
                }
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Nhập Số");
            }
        } while (true);
    }

    public static void triangleCheck(double size1, double size2, double size3) throws IllegalTriangleException {
        if (size1 <= 0 || size3 <= 0 || size2 <= 0) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại. Vui lòng nhập lại: ");
        } else {
            System.out.println("Tam giác có cạnh x = " + size1);
            System.out.println("Tam giác có cạnh y = " + size2);
            System.out.println("Tam giác có cạnh z = " + size3);
        }
    }
}
