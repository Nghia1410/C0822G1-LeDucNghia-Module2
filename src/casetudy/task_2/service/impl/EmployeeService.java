package casetudy.task_2.service.impl;

import casetudy.task_2.model.Employee;
import casetudy.task_2.service.IEmployeeService;
import casetudy.task_2.util.WriteReadEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String EMPLOYEE_PATH = "src\\casetudy\\task_2\\data\\employee.csv";


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
            String level = SCANNER.nextLine();
            System.out.println("input position");
            String position = SCANNER.nextLine();
            System.out.println("input salary");
            int salary = Integer.parseInt(SCANNER.nextLine());
            List<Employee> employeeList = WriteReadEmployee.readFileEmployee(EMPLOYEE_PATH);
            Employee employee = new Employee(id, fullName, dateOfBirth, sex, identityCard, phoneNumber, email, level, position, salary);
            employeeList.add(employee);
            System.out.println("Add complete");
            WriteReadEmployee.writeFileEmployee(EMPLOYEE_PATH, employeeList);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        List<Employee> employeeList = WriteReadEmployee.readFileEmployee(EMPLOYEE_PATH);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void delete() {
        List<Employee> employeeList = WriteReadEmployee.readFileEmployee(EMPLOYEE_PATH);
        int index = 0;
        boolean check = false;
        System.out.println("nh???p id b???n mu???n x??a");
        int number = Integer.parseInt(SCANNER.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (number == employeeList.get(i).getId()) {
                check = true;
                index = i;
            }
        }
        if (!check) {
            System.out.println("id kh??ng t???n t???i vui l??ng nh???p l???i id");
        } else {
            System.out.println("1.YES\n 2.NO");
            int choose = Integer.parseInt(SCANNER.nextLine());
            switch (choose) {
                case 1:
                    employeeList.remove(index);
                    System.out.println("???? x??a th??nh c??ng");
                    WriteReadEmployee.writeFileEmployee(EMPLOYEE_PATH, employeeList);
                case 2:
                    display();
            }

        }

    }


    @Override
    public void edit() {
        List<Employee> employees = WriteReadEmployee.readFileEmployee(EMPLOYEE_PATH);

        System.out.print("Nh???p m?? nh??n vi??n c???n ch???nh s???a: ");
        String idEdit = SCANNER.nextLine();

        boolean isExit = false;
        for (Employee employee : employees) {
            if (idEdit.equals(String.valueOf(employee.getId()))) {
                System.out.println("Nh??n vi??n b???n mu???n s???a: ");
                System.out.println(employee);

                do {
                    System.out.println("Ch???nh s???a th??ng tin nh??n vi??n:\n" +
                            "1. Ch???nh s???a m?? nh??n vi??n.\n" +
                            "2. Ch???nh s???a t??n .\n" +
                            "3. Ch???nh s???a ng??y sinh.\n" +
                            "4. Ch???nh s???a gi???i t??nh.\n" +
                            "5. Ch???nh s???a s??? CMND.\n" +
                            "6. Ch???nh s???a s??? ??i???n tho???i.\n" +
                            "7. Ch???nh s???a email.\n" +
                            "8. Ch???nh s???a tr??nh ?????.\n" +
                            "9. Ch???nh s???a v??? tr??.\n" +
                            "10. Ch???nh s???a l????ng.\n" +
                            "11. K???t th??c ch???nh s???a." +
                            "12. Hi???n th??? l???i menu");

                    System.out.print("M???i b???n nh???p l???a ch???n: ");
                    String choose = SCANNER.nextLine();

                    switch (choose) {
                        case "1":
                            System.out.print("Nh???p m?? nh??n vi??n: ");
                            employee.setId(SCANNER.nextInt());
                            employee.setId(employee.getId());

                            break;
                        case "2":
                            System.out.print("Nh???p t??n: ");
                            employee.setFullName(SCANNER.nextLine());
                            employee.setFullName(employee.getFullName());

                            break;
                        case "3":
                            System.out.print("Nh???p ng??y sinh: ");
                            employee.setDateOfBirth(SCANNER.nextInt());
                            employee.setDateOfBirth(employee.getDateOfBirth());

                            break;
                        case "4":
                            System.out.print("Nh???p gi???i t??nh: ");
                            employee.setSex(SCANNER.nextLine());
                            employee.setSex(employee.getSex());

                            break;
                        case "5":
                            System.out.print("Nh???p s??? CMND: ");
                            employee.setIdentityCard(SCANNER.nextInt());

                            break;
                        case "6":
                            System.out.print("Nh???p s??? ??i???n tho???i: ");
                            employee.setPhoneNumber(SCANNER.nextInt());
                            employee.setPhoneNumber(employee.getPhoneNumber());

                            break;
                        case "7":
                            System.out.print("Nh???p email: ");
                            employee.setEmail(SCANNER.nextLine());
                            employee.setEmail(employee.getEmail());
                            WriteReadEmployee.writeFileEmployee(EMPLOYEE_PATH, employees);
                            break;
                        case "8":
                            System.out.print("Nh???p tr??nh ?????: ");
                            employee.setLevel(SCANNER.nextLine());
                            employee.setLevel(employee.getLevel());

                            break;
                        case "9":
                            System.out.print("Nh???p v??? tr??: ");
                            employee.setPosition(SCANNER.nextLine());
                            employee.setPosition(employee.getPosition());

                            break;
                        case "10":
                            System.out.print("Nh???p l????ng: ");
                            employee.setSalary(Integer.parseInt(SCANNER.nextLine()));
                            employee.setSalary(employee.getSalary());

                            break;
                        case "11":
                            WriteReadEmployee.writeFileEmployee(EMPLOYEE_PATH, employees);
                            System.out.println("Ch???nh s???a th??nh c??ng!");
                            return;
                        case "12":
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


