package casetudy.task_2.model;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String fullName, int dateOfBirth, String sex, int identityCard, int phoneNumber, String email, String level, String position, int salary, String level1, String position1, int salary1) {
        super(id, fullName, dateOfBirth, sex, identityCard, phoneNumber, email, level, position, salary);
        this.level = level1;
        this.position = position1;
        this.salary = salary1;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}