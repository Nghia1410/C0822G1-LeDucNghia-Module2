package ss14_thuat_toan_sap_xep.exercise;

import java.util.Arrays;

public class InsertionSortByStep {
    private static void InsertionByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = key;
        }
        System.out.println("list after sort :" + Arrays.toString(list));
    }
}
