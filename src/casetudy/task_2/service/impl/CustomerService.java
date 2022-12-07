package casetudy.task_2.service.impl;

import casetudy.task_2.model.Customer;
import casetudy.task_2.model.Employee;
import casetudy.task_2.service.ICustomerService;
import casetudy.task_2.util.WriteRead;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String CUSTOMER_PATH = "src\\casetudy\\task_2\\util\\customer.csv";

    @Override
    public void add() {
        try {
            List<Customer> customers = WriteRead.readFileCustomer(CUSTOMER_PATH);
            System.out.println("input id:");
            int id = Integer.parseInt(SCANNER.nextLine());
            System.out.println("input fullname:");
            String fullName = SCANNER.nextLine();
            System.out.println("input date of birth:");
            int dateOfBirth = Integer.parseInt(SCANNER.nextLine());
            System.out.println("input sex:");
            String sex = SCANNER.nextLine();
            System.out.println("input identity card:");
            int identityCard = Integer.parseInt(SCANNER.nextLine());
            System.out.println("input phone number:");
            int phoneNumber = Integer.parseInt(SCANNER.nextLine());
            System.out.println("input email");
            String email = SCANNER.nextLine();
            System.out.println("input level");
            String level = SCANNER.nextLine();
            System.out.println("input position");
            String position = SCANNER.nextLine();
            System.out.println("input salary");
            int salary = Integer.parseInt(SCANNER.nextLine());
            System.out.println("input customer type");
            String customerType = SCANNER.nextLine();
            System.out.println("input address");
            String address = SCANNER.nextLine();
            Customer customer = new Customer(id, fullName, dateOfBirth, sex, identityCard, phoneNumber, email, level, position, salary, customerType, address);
            customers.add(customer);
            System.out.println("Add complete");
            WriteRead.writeFileCustomer(CUSTOMER_PATH, customers);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        List<Customer> customerList = WriteRead.readFileCustomer(CUSTOMER_PATH);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }

    @Override
    public void delete() {
        List<Customer> customerList = WriteRead.readFileCustomer(CUSTOMER_PATH);
        int index = 0;
        boolean check = false;
        System.out.println("nhập id bạn muốn xóa");
        int number = Integer.parseInt(SCANNER.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (number == customerList.get(i).getId()) {
                check = true;
                index = i;
            }
        }
        if (!check) {
            System.out.println("id không tồn tại vui lòng nhập lại id");
        } else {
            System.out.println("1.YES\n 2.NO");
            int choose = Integer.parseInt(SCANNER.nextLine());
            switch (choose) {
                case 1:
                    customerList.remove(index);
                    System.out.println("đã xóa thành công");
                    WriteRead.writeFileCustomer(CUSTOMER_PATH, customerList);
                    break;
                case 2:
                    display();
            }

        }

    }

    @Override
    public void edit() {

    }
}
