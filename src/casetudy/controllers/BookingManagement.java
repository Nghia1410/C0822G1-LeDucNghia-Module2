package casetudy.controllers;

public class BookingManagement extends FuramaController {
    public static void displayBookingManagement() {
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
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
                displayBookingManagement();
        }
    }
}
