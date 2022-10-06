package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số phần tử của mảng");
        int element = Integer.parseInt(scanner.nextLine());
        int[] array = new int[element];
        System.out.print("nhập giá trị các phần tử của mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhập phần tử thứ" + "[" + (i + 1) + "]");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.print("nhập giá trị phần tử cần xóa");
        int numberNeedDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (numberNeedDelete == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;

            }
        }
        System.out.println("mảng sau khi xóa: " + Arrays.toString(array));


    }
}
