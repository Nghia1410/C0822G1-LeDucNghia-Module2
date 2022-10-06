package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int number = scanner.nextInt();
        boolean check = true;
        if (number == 1) {
            check = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
            }
        }
        if (check) {
            System.out.println(number + " là số nguyên tố");

        } else {
            System.out.println(number + " không phải là số nguyên tố");
        }

    }
}
