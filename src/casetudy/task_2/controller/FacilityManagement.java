package casetudy.task_2.controller;

import casetudy.task_2.controller.FuramaController;

public class FacilityManagement extends FuramaController {
    public static void displayFacilityManagement() {
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        do {
            System.out.println("vui lòng nhập chức năng ");
            select = new Integer(scanner.nextLine());
            if (select > 4 || select < 1) {
                System.out.println("vui lòng nhập lại chức năng");
            }
        } while (select > 4 || select < 1);
        switch (select) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayFacilityManagement();

        }
    }
}
