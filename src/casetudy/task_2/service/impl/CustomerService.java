package casetudy.task_2.service.impl;

import casetudy.task_2.model.Customer;
import casetudy.task_2.service.ICustomerService;
import casetudy.task_2.util.WriteReadEmployee;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String CUSTOMER_PATH = "src\\casetudy\\task_2\\data\\customer.csv";

    @Override
    public void add() {
        try {
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
            String customerType = SCANNER.nextLine();
            System.out.println("input address");
            String address = SCANNER.nextLine();
            Customer customer = new Customer(id, fullName, dateOfBirth, sex, identityCard, phoneNumber, email, customerType, address);
            List<Customer> customers = WriteReadEmployee.readFileCustomer(CUSTOMER_PATH);
            customers.add(customer);
            System.out.println("Add complete");
            WriteReadEmployee.writeFileCustomer(CUSTOMER_PATH, customers);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        List<Customer> customerList = WriteReadEmployee.readFileCustomer(CUSTOMER_PATH);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }

    @Override
    public void delete() {}

    @Override
    public void edit() {
        List<Customer> customers = WriteReadEmployee.readFileCustomer(CUSTOMER_PATH);

        System.out.print("Nhập mã khách hàng cần chỉnh sửa: ");
        String idCustomerEdit = SCANNER.nextLine();

        boolean isExit = false;
        for (Customer customer : customers) {
            if (idCustomerEdit.equals(String.valueOf(customer.getId()))) {
                System.out.println("khách hàng bạn muốn sửa: ");
                System.out.println(customer);

                do {
                    System.out.println("Chỉnh sửa thông tin khách hàng:\n" +
                            "1. Chỉnh sửa mã khách hàng.\n" +
                            "2. Chỉnh sửa tên .\n" +
                            "3. Chỉnh sửa ngày sinh.\n" +
                            "4. Chỉnh sửa giới tính.\n" +
                            "5. Chỉnh sửa số CMND.\n" +
                            "6. Chỉnh sửa số điện thoại.\n" +
                            "7. Chỉnh sửa email.\n" +
                            "8. Chỉnh sửa loại khách hàng.\n" +
                            "9. Chỉnh sửa địa chỉ.\n" +
                            "10.Kết thúc chỉnh sửa.\n"+
                            "11.Hiển thị lại menu");


                    System.out.print("Mời bạn nhập lựa chọn: ");
                    String choose = SCANNER.nextLine();

                    switch (choose) {
                        case "1":
                            System.out.print("Nhập mã khách hàng: ");
                            customer.setId(SCANNER.nextInt());
                            customer.setId(customer.getId());

                            break;
                        case "2":
                            System.out.print("Nhập tên: ");
                            customer.setFullName(SCANNER.nextLine());
                            customer.setFullName(customer.getFullName());

                            break;
                        case "3":
                            System.out.print("Nhập ngày sinh: ");
                            customer.setDateOfBirth(SCANNER.nextInt());
                            customer.setDateOfBirth(customer.getDateOfBirth());

                            break;
                        case "4":
                            System.out.print("Nhập giới tính: ");
                            customer.setSex(SCANNER.nextLine());
                            customer.setSex(customer.getSex());

                            break;
                        case "5":
                            System.out.print("Nhập số CMND: ");
                            customer.setIdentityCard(SCANNER.nextInt());

                            break;
                        case "6":
                            System.out.print("Nhập số điện thoại: ");
                            customer.setPhoneNumber(SCANNER.nextInt());
                            customer.setPhoneNumber(customer.getPhoneNumber());

                            break;
                        case "7":
                            System.out.print("Nhập email: ");
                            customer.setEmail(SCANNER.nextLine());
                            customer.setEmail(customer.getEmail());
                            break;
                        case "8":
                            System.out.print("Nhập loại khách hàng: ");
                            customer.setCustomerType(SCANNER.nextLine());
                            customer.setCustomerType(customer.getCustomerType());
                            break;
                        case "9":
                            System.out.print("Nhập địa chỉ: ");
                            customer.setAddress(SCANNER.nextLine());
                            customer.setAddress(customer.getAddress());
                            break;
                        case "10":
                            WriteReadEmployee.writeFileCustomer(CUSTOMER_PATH, customers);
                            System.out.println("Chỉnh sửa thành công!");
                            break;
                        case "11":
                            return;
                        default:
                            System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
                    }
                } while (true);
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy!");
        }
    }
}
