package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TotalOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        do {
            System.out.println("Nhập độ dài của mảng:");
            number1 = Integer.parseInt(scanner.nextLine());
            if (number1 <= 0) {
                System.out.println("Nhập lại độ dài của mảng > 0 ");
            }

        } while (number1 <= 0);
        do {
            System.out.println("Nhập độ dài phần tử của mảng:");
            number2 = Integer.parseInt(scanner.nextLine());
            if (number2 <= 0) {
                System.out.println("Nhập lại độ dài của phần tử trong mảng > 0 ");
            }

        } while (number2 <= 0);
        int[][] array = new int[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.println("nhập phần tử thứ " + j + " của mảng " + i);
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int column;
        int total = 0;
        do {
            System.out.println("nhập cột mà bạn muốn tính tổng");
            column = Integer.parseInt(scanner.nextLine());
            if (column < 0 || column > array.length - 1) {
                System.out.println("vui lòng nhập lại số cột < độ dài của mảng ");
            }
        } while (column < 0 || column > array.length - 1);

        for (int i = 0; i < array.length; i++) {
            total += array[i][column];

        }
        System.out.println("tổng của cột " + column + " là " + total);
    }
}
