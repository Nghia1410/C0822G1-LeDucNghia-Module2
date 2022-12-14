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

        System.out.print("Nh???p m?? kh??ch h??ng c???n ch???nh s???a: ");
        String idCustomerEdit = SCANNER.nextLine();

        boolean isExit = false;
        for (Customer customer : customers) {
            if (idCustomerEdit.equals(String.valueOf(customer.getId()))) {
                System.out.println("kh??ch h??ng b???n mu???n s???a: ");
                System.out.println(customer);

                do {
                    System.out.println("Ch???nh s???a th??ng tin kh??ch h??ng:\n" +
                            "1. Ch???nh s???a m?? kh??ch h??ng.\n" +
                            "2. Ch???nh s???a t??n .\n" +
                            "3. Ch???nh s???a ng??y sinh.\n" +
                            "4. Ch???nh s???a gi???i t??nh.\n" +
                            "5. Ch???nh s???a s??? CMND.\n" +
                            "6. Ch???nh s???a s??? ??i???n tho???i.\n" +
                            "7. Ch???nh s???a email.\n" +
                            "8. Ch???nh s???a lo???i kh??ch h??ng.\n" +
                            "9. Ch???nh s???a ?????a ch???.\n" +
                            "10.K???t th??c ch???nh s???a.\n"+
                            "11.Hi???n th??? l???i menu");


                    System.out.print("M???i b???n nh???p l???a ch???n: ");
                    String choose = SCANNER.nextLine();

                    switch (choose) {
                        case "1":
                            System.out.print("Nh???p m?? kh??ch h??ng: ");
                            customer.setId(SCANNER.nextInt());
                            customer.setId(customer.getId());

                            break;
                        case "2":
                            System.out.print("Nh???p t??n: ");
                            customer.setFullName(SCANNER.nextLine());
                            customer.setFullName(customer.getFullName());

                            break;
                        case "3":
                            System.out.print("Nh???p ng??y sinh: ");
                            customer.setDateOfBirth(SCANNER.nextInt());
                            customer.setDateOfBirth(customer.getDateOfBirth());

                            break;
                        case "4":
                            System.out.print("Nh???p gi???i t??nh: ");
                            customer.setSex(SCANNER.nextLine());
                            customer.setSex(customer.getSex());

                            break;
                        case "5":
                            System.out.print("Nh???p s??? CMND: ");
                            customer.setIdentityCard(SCANNER.nextInt());

                            break;
                        case "6":
                            System.out.print("Nh???p s??? ??i???n tho???i: ");
                            customer.setPhoneNumber(SCANNER.nextInt());
                            customer.setPhoneNumber(customer.getPhoneNumber());

                            break;
                        case "7":
                            System.out.print("Nh???p email: ");
                            customer.setEmail(SCANNER.nextLine());
                            customer.setEmail(customer.getEmail());
                            break;
                        case "8":
                            System.out.print("Nh???p lo???i kh??ch h??ng: ");
                            customer.setCustomerType(SCANNER.nextLine());
                            customer.setCustomerType(customer.getCustomerType());
                            break;
                        case "9":
                            System.out.print("Nh???p ?????a ch???: ");
                            customer.setAddress(SCANNER.nextLine());
                            customer.setAddress(customer.getAddress());
                            break;
                        case "10":
                            WriteReadEmployee.writeFileCustomer(CUSTOMER_PATH, customers);
                            System.out.println("Ch???nh s???a th??nh c??ng!");
                            break;
                        case "11":
                            return;
                        default:
                            System.out.println("L???a ch???n c???a b???n kh??ng c??, vui l??ng ch???n l???i!");
                    }
                } while (true);
            }
        }
        if (!isExit) {
            System.out.println("Kh??ng t??m th???y!");
        }
    }
}
