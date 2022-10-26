package ss14_thuat_toan_sap_xep.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        InsertionByStep(list);
    }

    private static void InsertionByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
                System.out.println("các bước thay dổi :" + Arrays.toString(list));
            }
            list[j + 1] = key;
            System.out.println("mảng sau khi chèn phần tử i = " + (j + 1) + " là " + key + "\t " + Arrays.toString(list));

        }
        System.out.print("Lis\nt after sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();
    }
}