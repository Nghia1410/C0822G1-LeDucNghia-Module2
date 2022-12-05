package casetudy.task_2.controller;

import casetudy.task_2.controller.FuramaController;
import casetudy.task_2.service.IService;
import casetudy.task_2.service.impl.EmployeeService;

public class EmployeeManagement extends FuramaController {
    public static void displayEmployeeManagement() {
        IService service = new EmployeeService();
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tDelete employee\n" +
                "4\tEdit employee\n" +
                "5\tReturn main menu\n");

        do {
            System.out.println("vui lòng chọn chức năng: ");
            select = new Integer(scanner.nextLine());
            if (select > 5 || select < 1) {
                System.out.println("vui lòng nhập lại chức năng ");
            }
        } while (select > 5 || select < 1);
        switch (select) {
            case 1:
                service.display();
                displayEmployeeManagement();
                break;
            case 2:
                service.add();
                displayEmployeeManagement();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                displayEmployeeManagement();
        }
    }
}
