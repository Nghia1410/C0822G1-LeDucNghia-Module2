package casetudy.controllers;

import java.util.Scanner;

public class FuramaController {

    static Scanner scanner = new Scanner(System.in);
    static int select;

    public static void displayMainMenu() {
        System.out.println("1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit \n");
        do {
            System.out.println("nhập lựa chọn:");
            select = Integer.parseInt(scanner.nextLine());
        } while (select > 6 || select < 1);
        switch (select) {
            case 1:
                EmployeeManagement.displayEmployeeManagement();
                break;
            case 2:
                CustomerManagement.displayCustomerManagement();
                break;
            case 3:
                FacilityManagement.displayFacilityManagement();
                break;
            case 4:
                BookingManagement.displayBookingManagement();
                break;
            case 5:
                PromotionManagement.displayPromotionManagement();
                break;
            case 6:
                break;
        }
    }

}

