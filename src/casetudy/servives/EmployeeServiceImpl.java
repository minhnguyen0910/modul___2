package casetudy.servives;

import casetudy.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void display() {
        if (employeeList.isEmpty()) {
            System.out.println("danh sach trong");
        } else {
            for (int i = 0; i < employeeList.size(); i++) {
                System.out.println(employeeList.get(i));
            }
        }
    }

    public void add() {
        System.out.println("ten nhan vien");
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
        System.out.println("ma nhan vien");
        boolean flag;
        int employeeCode;
        do {
             employeeCode = Integer.parseInt(scanner.nextLine());
            flag = true;
            for (Employee i : employeeList) {
                if (employeeCode == i.getEmployeeCode()) {
                    System.out.println("ma da ton tai\n" +
                            "moi ban nhap lai");
                    flag = false;
                    break;
                }
            }
        } while (flag);

        System.out.println("moi ban chon trinh do\n" + "1.trung cap\n" + "2.cao dang\n" + "3.dai hoc\n" + "4.sau dai hoc\n" + "5.khac");
        int num;
        do {
            num = Integer.parseInt(scanner.nextLine());
            if (num < 1 || num > 5) {
                System.out.println("nhap lai num");
            }
        } while (num < 1 || num > 5);

        String level = null;
        switch (num) {
            case 1:
                level = "trung cap";
                break;
            case 2:
                level = "cao dang";
                break;
            case 3:
                level = "dai hoc";
                break;
            case 4:
                level = "sau dai hoc";
                break;
            case 5:
                level = scanner.nextLine();
        }
        System.out.println("vi tri lam viec\n" + "1.le tan\n" + "2.phuc vu\n" + "3.chuyen vien\n" + "4.giam sat\n" + "5.giam doc\n" + "6.vi tri khac");
        int num1;
        do {
            num1 = Integer.parseInt(scanner.nextLine());
            if (num1 < 1 || num1 > 5) {
                System.out.println("nhap lai number");
            }
        } while (num1 < 1 || num1 > 5);
        String workingPosition = null;
        switch (num1) {
            case 1:
                workingPosition = "le tan";
                break;
            case 2:
                workingPosition = "phuc vu";
                break;
            case 3:
                workingPosition = "chuyen vien";
                break;
            case 4:
                workingPosition = "giam sat";
                break;
            case 5:
                workingPosition = "giam doc";
                break;
            case 6:
                workingPosition = scanner.nextLine();
        }
        System.out.println("nhap so luong");
        Double wage = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, employeeCode, level, workingPosition, wage);
        employeeList.add(employee);
    }

    public void edit() {
        do {
            System.out.println("nhap thong tin can sua\n" + "1.ten\n" + "2.ngay sinh\n" + "3.gioi tinh\n" + "4.so chung minh nhan dan\n" + "5.so dien thoai\n" + "6.email\n" + "7.ma nhan vien\n" + "8.cap do\n" + "9.vi tri lam viec\n" + "10.luong\n" +
                    "11.exit");
            int choose;
            do {
                choose = Integer.parseInt(scanner.nextLine());
                if (choose < 1 || choose > 10) {
                    System.out.println("nhap lai lua chon cua ban");
                }
            } while (choose < 1 || choose > 10);

            switch (choose) {
                case 1: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String nameBefore = scanner.nextLine();
                    System.out.println("nhap ten moi");
                    String nameAfter = scanner.nextLine();
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (nameAfter.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setName(nameAfter);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                }
                break;
                case 2: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap ngay moi");
                    int day = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setDayOfBirth(day);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 3: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap gioi tinh");
                    String sex = scanner.nextLine();
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setSex(sex);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 4: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap so chung minh nhan dan moi");
                    int identityCardNumber = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setDayOfBirth(identityCardNumber);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 5: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap so dien thoai moi");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setPhoneNumber(phoneNumber);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 6: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap email moi");
                    String email = scanner.nextLine();
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setEmail(email);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 7: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap ma cong nhan moi");
                    int employeeCode = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setEmployeeCode(employeeCode);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 8: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("cap nhat lai trinh do");
                    String level = scanner.nextLine();
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setLevel(level);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 9: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap vi tri lam viec moi");
                    String workingPosition = scanner.nextLine();
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setWorkingPosition(workingPosition);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 10: {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap so luong moi");
                    Double wage = Double.parseDouble(scanner.nextLine());
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (name.equals(employeeList.get(i).getName())) {
                            employeeList.get(i).setWage(wage);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }
                    break;
                }
                case 11:
                    System.exit(1);
                    break;
                default:
                    System.out.println("nhap tu co trong menu");

            }
        } while (true);
    }

    public void delete() {
        System.out.println("nhap ten can xoa");
        String name = scanner.nextLine();
        if (employeeList.isEmpty()) {
            System.out.println("khong co nhan vien");
        } else {
            for (int i = 0; i < employeeList.size(); i++) {
                if (name.equals(employeeList.get(i).getName())) {
                    employeeList.remove(i);
                }
            }
        }
    }
}

