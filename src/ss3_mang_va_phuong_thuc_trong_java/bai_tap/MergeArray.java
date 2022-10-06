package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng 1: ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng 1 là: " + Arrays.toString(array1));
        System.out.println();
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng 2: ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng 2 là: " + Arrays.toString(array2));
        System.out.println();
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (i == j) {
                    array3[i] = array1[i];
                    break;
                }
            }
        }
        for (int i = array1.length; i < array3.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (i == j + array1.length) {
                    array3[i] = array2[j];
                }
            }
        }
        System.out.println("Mảng vừa gộp là: " + Arrays.toString(array3));
    }
}

