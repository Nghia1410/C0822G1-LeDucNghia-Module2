package bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập số tiền USD: ");
        double usd = Double.parseDouble(scanner.nextLine());
        double vnd = 23000;
        double regulations = usd * vnd;
        System.out.println("Giá trị VND là: " + regulations);

    }
}
