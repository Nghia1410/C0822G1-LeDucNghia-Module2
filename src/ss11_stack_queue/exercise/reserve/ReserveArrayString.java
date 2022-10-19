package ss11_stack_queue.exercise.reserve;

import java.util.Scanner;
import java.util.Stack;

public class ReserveArrayString {
    public static void main(String[] args) {
        Stack<String> stringArray = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("input element: ");
        String string = scanner.nextLine();

        System.out.println("mảng chuỗi sau khi đảo: ");
        String[] split = string.split("");
        //thêm phần tử vào mảng
        for (int i = 0; i < split.length; i++) {
            stringArray.push(split[i]);
        }
        //in ra mảng đảo ngược
        while (!stringArray.empty()) {
            System.out.print(stringArray.pop());
        }
    }
}
