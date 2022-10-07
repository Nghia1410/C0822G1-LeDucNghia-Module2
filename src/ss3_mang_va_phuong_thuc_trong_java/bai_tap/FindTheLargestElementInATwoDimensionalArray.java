package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheLargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        do {
            System.out.print("nhập độ dài của mảng: ");
            number1 = Integer.parseInt(scanner.nextLine());
            if (number1 < 0) {
                System.out.print("vui lòng nhập độ dài>0");

            }
        } while (number1 < 0);

        do {
            System.out.print("nhập độ dài của mảng con");
            number2 = Integer.parseInt(scanner.nextLine());
            if (number2 < 0) {
                System.out.print("vui lòng nhập độ dài phần tử của mảng >0");
            }
        } while (number2 < 0);
        int[][] array = new int[number1][number2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.print("nhập phần tử thứ " + j  + "của mảng" + i);
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int max=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <number2 ; j++) {
                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
        }System.out.println("giá trị phần tử lớn nhất "+max);


    }
}
