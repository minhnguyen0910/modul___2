package casetudy.servives;

import casetudy.models.Customer;
import casetudy.models.People;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    public void add() {
        System.out.println("ten khach hang");
        String name = scanner.nextLine();
        System.out.println("ngay sinh");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("gioi tinh");
        String sex = scanner.nextLine();
        System.out.println("so chung minh nhan dan");
        int identityCardNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("so dien thoai");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("ma khach hang");
        int customerCode;
        boolean flagOfCustomer;
        do {
            customerCode = Integer.parseInt(scanner.nextLine());
            flagOfCustomer=true;
            for (Customer i : customerList) {
                if (customerCode == i.getCustomerCode()) {
                    System.out.println("ma da ton tai\n" +
                            "vui long nhap ma khac");
                    flagOfCustomer=false;
                }
            }
        }while (!flagOfCustomer);

        System.out.println("chon kieu khach hang\n" +
                "1.Diamond\n" +
                "2.Platinium\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member");
        String customerType = null;
        int choose = 0;
        boolean flagOfCustomerType;
        do {
            try {
                do {
                    choose = Integer.parseInt(scanner.nextLine());
                    if (choose > 5 || choose < 1) {
                        System.out.println("nhap lua chon tu 1=>5");
                    }
                    flagOfCustomerType = true;
                } while (choose > 5 || choose < 1);

            } catch (NumberFormatException e) {
                System.out.println("nhap chu");
                flagOfCustomerType = false;
            }
        } while (!flagOfCustomerType);


        switch (choose) {
            case 1:
                customerType = "Diamond";
                break;
            case 2:
                customerType = "Platinium";
                break;
            case 3:
                customerType = "Gold";
            case 4:
                customerType = "Silver";
                break;
            case 5:
                customerType = "Member";

        }
        Customer newCustomer = new Customer(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, customerCode, customerType);
        customerList.add(newCustomer);
    }

    public void display() {
        if (customerList.isEmpty()) {
            System.out.println("không có khách hàng");
        } else {
            for (People i : customerList) {
                System.out.println(i);
            }
        }
    }

    public void edit() {
        System.out.println("nhap ma khách hang");
        int customerCode = Integer.parseInt(scanner.nextLine());
        boolean flagOfPeople = false;
        for (Customer i : customerList) {
            if (customerCode == i.getCustomerCode()) {
                flagOfPeople = true;
            }
        }
        if (flagOfPeople) {
            System.out.println("nhap thong tin can sua\n" +
                    "1.name\n" +
                    "2.ngay sinh\n" +
                    "3.gioi tinh\n" +
                    "4.so chung minh nhan dan\n" +
                    "5.so dien thoi\n" +
                    "6.email\n" +
                    "7.ma khach hang\n" +
                    "8.kieu khach hang");
            int choose = 0;
            boolean flag;
            do {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    flag = true;
                    if (choose < 1 || choose > 8) {
                        System.out.println("vui long nhap lua chon tu 1 => 8");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap lua chon bang so tu 1 => 8");
                    flag = false;
                }
            } while (!flag);
            switch (choose) {
                case 1:
                    System.out.println("nhap ten moi");
                    String name = scanner.nextLine();
                    for (Customer i : customerList) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setName(name);
                        }
                    }
                    break;
                case 2:
                    System.out.println("nhap ngay sinh moi");
                    int dayOfBirth = Integer.parseInt(scanner.nextLine());
                    for (Customer i : customerList) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setDayOfBirth(dayOfBirth);
                        }
                    }
                    break;
                case 3:
                    System.out.println("nhap gioi tinh");
                    String sex = scanner.nextLine();
                    for (Customer i : customerList) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setSex(sex);
                        }
                    }
                    break;
                case 4:
                    System.out.println("nhap so cmnd moi");
                    int identityCardNumber = Integer.parseInt(scanner.nextLine());
                    for (Customer i : customerList) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setIdentityCardNumber(identityCardNumber);
                        }
                    }
                    break;
                case 5:
                    System.out.println("nhap so dien thoai moi");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    for (Customer i : customerList) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setPhoneNumber(phoneNumber);
                        }
                    }
                    break;
                case 6:
                    System.out.println("nhap email moi");
                    String email = scanner.nextLine();
                    for (Customer i : customerList) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setEmail(email);
                        }
                    }
                    break;
                case 7:
                    System.out.println("nhap ma moi");
                    int newCustomerCode = Integer.parseInt(scanner.nextLine());
                    boolean flags = false;
                    for (Customer i : customerList) {
                        if (customerCode == i.getCustomerCode()) {
                            flags = true;
                        }
                    }
                    if (flags) {
                        for (Customer i : customerList) {
                            if (customerCode == i.getCustomerCode()) {
                                i.setCustomerCode(newCustomerCode);
                            }
                        }
                    } else {
                        System.out.println("ma khach hang da on tai");
                    }
                    break;
                case 8:
                    System.out.println("chon kieu khach hang moi\n" +
                            "1.Diamond\n" +
                            "2.Platinium\n" +
                            "3.Gold\n" +
                            "4.Silver\n" +
                            "5.Member");
                    String customerType;
                    int chooseNew = 0;
                    boolean flagOfCustomerType;
                    do {
                        try {
                            do {
                                chooseNew = Integer.parseInt(scanner.nextLine());
                                if (chooseNew > 5 || chooseNew < 1) {
                                    System.out.println("nhap lua chon tu 1=>5");
                                }
                                flagOfCustomerType = true;
                            } while (chooseNew > 5 || chooseNew < 1);

                        } catch (NumberFormatException e) {
                            System.out.println("nhap chu");
                            flagOfCustomerType = false;
                        }
                    } while (!flagOfCustomerType);


                    switch (chooseNew) {
                        case 1:
                            customerType = "Diamond";
                            break;
                        case 2:
                            customerType = "Platinium";
                            break;
                        case 3:
                            customerType = "Gold";
                        case 4:
                            customerType = "Silver";
                            break;
                        case 5:
                            customerType = "Member";

                    }
            }
        } else {
            System.out.println("ma khong ton tai");
        }
    }

    public void remove() {
        if (customerList.isEmpty()) {
            System.out.println("khong co khach hang");
        } else {
            System.out.println("nhap ma khach hang");
            int customerCode = Integer.parseInt(scanner.nextLine());
            boolean flag = true;
            for (Customer i : customerList) {
                if (customerCode == i.getCustomerCode()) {
                    i.setCustomerCode(customerCode);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("ma khong ton tai");
            }
        }
    }

    public static void main(String[] args) {
        CustomerServiceImpl a = new CustomerServiceImpl();
        a.add();
    }


}
