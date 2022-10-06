package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int height;
        int width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        height = scanner.nextInt();
        System.out.println("nhập chiều rộng");
        width = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

