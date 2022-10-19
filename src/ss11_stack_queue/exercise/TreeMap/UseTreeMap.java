package ss11_stack_queue.exercise.TreeMap;


import java.util.Map;
import java.util.Scanner;

public class UseTreeMap {

    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new java.util.TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input String: ");
        String string = scanner.nextLine();
        String inputLowerCase = string.toLowerCase();
        String[] stringArray = inputLowerCase.split("");
        for (int i = 0; i < stringArray.length; i++) {
            if (stringIntegerMap.containsKey(stringArray[i])) {
                //cộng giá trị value thêm 1
                stringIntegerMap.put(stringArray[i], stringIntegerMap.get(stringArray[i]) + 1);
            } else {
                stringIntegerMap.put(stringArray[i], 1);
            }
        }
        //xuất kết quả
        for (String key : stringIntegerMap.keySet()
        ) {
            System.out.print(key + ": ");
            System.out.println(stringIntegerMap.get(key));
        }
    }
}

