package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class CountTheNumberOfOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String str;
        System.out.println("nhập vào một chuỗi:");
        str = scanner.nextLine();
        System.out.println("nhập vào ký tự");
        char alphabet = scanner.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == alphabet) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + str + " ở trong chuỗi " + str + " = " + count);
    }
}
