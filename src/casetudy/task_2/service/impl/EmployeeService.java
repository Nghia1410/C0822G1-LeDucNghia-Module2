package casetudy.task_2.service.impl;

import casetudy.task_2.model.Employee;
import casetudy.task_2.service.IEmployeeService;
import casetudy.task_2.util.WriteRead;

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
            List<Employee> employeeList = WriteRead.readFileEmployee(EMPLOYEE_PATH);
            Employee employee = new Employee(id, fullName, dateOfBirth, sex, identityCard, phoneNumber, email, level, position, salary);
            employeeList.add(employee);
            System.out.println("Add complete");
            WriteRead.writeFileEmployee(EMPLOYEE_PATH, employeeList);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        List<Employee> employeeList = WriteRead.readFileEmployee(EMPLOYEE_PATH);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void delete() {
        List<Employee> employeeList = WriteRead.readFileEmployee(EMPLOYEE_PATH);
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
                    WriteRead.writeFileEmployee(EMPLOYEE_PATH, employeeList);
                    break;
                case 2:
                    display();
            }

        }
    }


    @Override
    public void edit() {
//        List<Employee> employeeList = WriteRead.readFileEmployee(EMPLOYEE_PATH);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập id muốn xoá: ");
//        String number = scanner.nextLine();
//        boolean check = false;
//
//            for (int i = 0; i < employeeList.size(); i++) {
//                if (!number.equals(employeeList.get(i).getId())) {
//                    check = true;
//                    System.out.println(employeeList.get(i).toString());
//                }
//            }
//            if (check) {
//                System.out.println("id không tồn tại vui lòng nhập lại");
//            }
//        }
    }
}


