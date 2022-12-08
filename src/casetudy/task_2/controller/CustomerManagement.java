package casetudy.task_2.controller;

import casetudy.task_2.controller.FuramaController;
import casetudy.task_2.service.IService;
import casetudy.task_2.service.impl.CustomerService;

public class CustomerManagement extends FuramaController {
    public static void displayCustomerManagement() {
        IService customerService=new CustomerService();
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
                customerService.display();
                displayCustomerManagement();
                break;
            case 2:
                customerService.add();
                displayCustomerManagement();
                break;
            case 3:
                customerService.edit();
                displayCustomerManagement();
                break;
            case 4:
             displayMainMenu();

        }
    }
}
