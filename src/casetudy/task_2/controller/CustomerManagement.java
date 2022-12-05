package casetudy.controllers;

public class CustomerManagement extends FuramaController {
    public static void displayCustomerManagement() {
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        do {
            System.out.println("vui lòng nhập chức năng: ");
            select = new Integer(scanner.nextLine());
            if (select > 5 || select < 1) {
                System.out.println("vui lòng nhập lại chức năng");
            }
        } while (select > 5 || select < 1);
        switch (select) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayCustomerManagement();

        }
    }
}
