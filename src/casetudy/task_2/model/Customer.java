package casetudy.task_2.model;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String fullName, int dateOfBirth, String sex, int identityCard, int phoneNumber, String email, String customerType, String address) {
        super(id, fullName, dateOfBirth, sex, identityCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String fullName, int dateOfBirth, String sex, int identityCard, int phoneNumber, String email, String level, String position, int salary, String customerType, String address) {
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
