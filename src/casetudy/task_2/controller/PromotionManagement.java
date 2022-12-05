package casetudy.task_2.controller;

import casetudy.task_2.controller.FuramaController;

public class PromotionManagement extends FuramaController {
    public static void displayPromotionManagement() {
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        do {
            System.out.println("vui lòng nhập chức năng ");
            select = new Integer(scanner.nextLine());
            if (select > 3 || select < 1) {
                System.out.println("vui lòng nhập lại chức năng");
            }
        } while (select > 3 || select < 1);
        switch (select) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                displayPromotionManagement();


        }
    }

}
