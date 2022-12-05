package casetudy.task_2.service.impl;

import casetudy.task_2.model.Person;
import casetudy.task_2.service.IEmployeeService;
import casetudy.task_2.util.WriteRead;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src\\casetudy\\task_2\\util\\employee.csv";


    @Override
    public void add() {
        try {
            List<Person> personList = WriteRead.readFile(PATH);
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
            Person person = new Person(id, fullName, dateOfBirth, sex, identityCard, phoneNumber, email, level, position, salary);
            personList.add(person);
            System.out.println("Add complete");
            WriteRead.writeFile(PATH, personList);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        List<Person> personList=WriteRead.readFile(PATH);
        for (Person employee:personList) {
            System.out.println(employee);
        }


    }
}
