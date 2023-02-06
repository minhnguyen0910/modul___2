package casetudy.models;

public class Customer extends People{
int customerCode;
String customerType;

    public Customer(String name, int dayOfBirth, String sex, int identityCardNumber, int phoneNumber, String email, int customerCode, String customerType) {
        super(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", customerType='" + customerType + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", sex='" + sex + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
