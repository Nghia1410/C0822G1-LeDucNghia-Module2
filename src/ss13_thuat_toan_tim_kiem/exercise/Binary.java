package ss13_thuat_toan_tim_kiem.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Nhập phần tử cần tìm vị trí: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.print("Vị trí phần tử cần tìm là: " + binarySearch(arr, value, 0, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int value, int left, int right) {
        int middle = (left + right) / 2;
        if (arr[middle] == value) {
            return middle;
        }
        if (value > arr[middle]) {
            return binarySearch(arr, value, middle + 1, right);
        }
        return binarySearch(arr, value, left, middle - 1);
    }
}
