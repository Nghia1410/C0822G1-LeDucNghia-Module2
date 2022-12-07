package casetudy.task_2.util;

import casetudy.task_2.model.Customer;
import casetudy.task_2.model.Employee;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteRead {
    public static List<Employee> readFileEmployee(String path) {
        List<Employee> employees = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Employee employee = new Employee(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4])
                        , Integer.parseInt(array[5]), array[6], array[7], array[8], Integer.parseInt(array[9]));
                employees.add(employee);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void writeFileEmployee(String path, List<Employee> employeeList) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee item : employeeList) {
                bufferedWriter.write(item.getId() + "," + item.getFullName() + "," + item.getDateOfBirth() + "," + item.getSex()
                        + "," + item.getIdentityCard() + "," + item.getPhoneNumber() + "," + item.getEmail() + "," + item.getLevel() + "," + item.getPosition() + "," + item.getSalary());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFileCustomer(String path) {
        List<Customer> customers = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Customer customer = new Customer(array[0], array[1]);
                customers.add(customer);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public static void writeFileCustomer(String path, List<Customer> customerList) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer item : customerList) {
                bufferedWriter.write(item.getId() + "," + item.getFullName() + "," + item.getDateOfBirth() + "," + item.getSex() + "," + item.getIdentityCard() +
                        "," + item.getPhoneNumber() + "," + item.getEmail() + "," + item.getCustomerType() + "," + item.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
