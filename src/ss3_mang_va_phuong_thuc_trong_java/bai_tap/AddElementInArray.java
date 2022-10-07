package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 3, 2, 5, 4, 6};
        System.out.println("nhập số muốn chèn");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vị trí cần chèn:");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("không chèn được phần tử vào mảng: ");
        } else {
            System.arraycopy(array, index, array, index + 1, array.length - 1 - index);
            array[index] = number;
            System.out.println(Arrays.toString(array));
        }


    }
}
