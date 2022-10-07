package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class CrossLinesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        //nhập độ dài của mảng
        do {
            System.out.println("nhập độ dài của mảng:");
            number1 = Integer.parseInt(scanner.nextLine());
            if (number1 <= 0) {
                System.out.println("vui lòng nhập lại độ dài của mảng>=0");
            }
        } while (number1 <= 0);
        //độ dài của phần tử con
        do {
            System.out.println("nhập độ dài phần tử trong mảng");
            number2 = Integer.parseInt(scanner.nextLine());
            if (number2 <= 0) {
                System.out.println("vui lòng nhập lại độ dài phần tử của mảng>0");
            }
        } while (number2 <= 0);
        //nhập từng phần tử của mảng
        int[][] array = new int[number1][number2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.println("nhập phần tử thứ" + j + "của mảng" + i);
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //xuất ra mảng hai chiều
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < number2; j++) {
                if (i == j || i + j == array.length - 1) {
                    total += array[i][j];
                }
            }
        }
        System.out.println("tổng của hai đường chéo là: " + total);

    }
}
