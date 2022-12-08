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
        System.out.println("nhập id bạn muốn xóa");
        int number = Integer.parseInt(SCANNER.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (number == employeeList.get(i).getId()) {
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
                    employeeList.remove(index);
                    System.out.println("đã xóa thành công");
                    WriteReadEmployee.writeFileEmployee(EMPLOYEE_PATH, employeeList);
                case 2:
                    display();
            }

        }

    }


    @Override
    public void edit() {
        List<Employee> employees = WriteReadEmployee.readFileEmployee(EMPLOYEE_PATH);

        System.out.print("Nhập mã nhân viên cần chỉnh sửa: ");
        String idEdit = SCANNER.nextLine();

        boolean isExit = false;
        for (Employee employee : employees) {
            if (idEdit.equals(String.valueOf(employee.getId()))) {
                System.out.println("Nhân viên bạn muốn sửa: ");
                System.out.println(employee);

                do {
                    System.out.println("Chỉnh sửa thông tin nhân viên:\n" +
                            "1. Chỉnh sửa mã nhân viên.\n" +
                            "2. Chỉnh sửa tên .\n" +
                            "3. Chỉnh sửa ngày sinh.\n" +
                            "4. Chỉnh sửa giới tính.\n" +
                            "5. Chỉnh sửa số CMND.\n" +
                            "6. Chỉnh sửa số điện thoại.\n" +
                            "7. Chỉnh sửa email.\n" +
                            "8. Chỉnh sửa trình độ.\n" +
                            "9. Chỉnh sửa vị trí.\n" +
                            "10. Chỉnh sửa lương.\n" +
                            "11. Kết thúc chỉnh sửa." +
                            "12. Hiển thị lại menu");

                    System.out.print("Mời bạn nhập lựa chọn: ");
                    String choose = SCANNER.nextLine();

                    switch (choose) {
                        case "1":
                            System.out.print("Nhập mã nhân viên: ");
                            employee.setId(SCANNER.nextInt());
                            employee.setId(employee.getId());

                            break;
                        case "2":
                            System.out.print("Nhập tên: ");
                            employee.setFullName(SCANNER.nextLine());
                            employee.setFullName(employee.getFullName());

                            break;
                        case "3":
                            System.out.print("Nhập ngày sinh: ");
                            employee.setDateOfBirth(SCANNER.nextInt());
                            employee.setDateOfBirth(employee.getDateOfBirth());

                            break;
                        case "4":
                            System.out.print("Nhập giới tính: ");
                            employee.setSex(SCANNER.nextLine());
                            employee.setSex(employee.getSex());

                            break;
                        case "5":
                            System.out.print("Nhập số CMND: ");
                            employee.setIdentityCard(SCANNER.nextInt());

                            break;
                        case "6":
                            System.out.print("Nhập số điện thoại: ");
                            employee.setPhoneNumber(SCANNER.nextInt());
                            employee.setPhoneNumber(employee.getPhoneNumber());

                            break;
                        case "7":
                            System.out.print("Nhập email: ");
                            employee.setEmail(SCANNER.nextLine());
                            employee.setEmail(employee.getEmail());
                            WriteReadEmployee.writeFileEmployee(EMPLOYEE_PATH, employees);
                            break;
                        case "8":
                            System.out.print("Nhập trình độ: ");
                            employee.setLevel(SCANNER.nextLine());
                            employee.setLevel(employee.getLevel());

                            break;
                        case "9":
                            System.out.print("Nhập vị trí: ");
                            employee.setPosition(SCANNER.nextLine());
                            employee.setPosition(employee.getPosition());

                            break;
                        case "10":
                            System.out.print("Nhập lương: ");
                            employee.setSalary(Integer.parseInt(SCANNER.nextLine()));
                            employee.setSalary(employee.getSalary());

                            break;
                        case "11":
                            WriteReadEmployee.writeFileEmployee(EMPLOYEE_PATH, employees);
                            System.out.println("Chỉnh sửa thành công!");
                            return;
                        case "12":
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


