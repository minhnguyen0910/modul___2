package casetudy.controller;

import casetudy.servives.CustomerServiceImpl;
import casetudy.servives.EmployeeServiceImpl;
import casetudy.servives.FacilityServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choose;
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService= new FacilityServiceImpl();

        do {
            System.out.println("nhap lua chon cua ban\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    do {
                        System.out.println("1.Display list employees\n" +
                                "2.Add new employees\n" +
                                "3.Delete employees\n" +
                                "4.Edit employees\n" +
                                "5.Return main menu\n");

                        String chooseCase1 = scanner.nextLine();
                        switch (chooseCase1) {
                            case "1":
                                employeeService.display();
                                break;
                            case "2":
                                employeeService.add();
                                break;
                            case "3":
                                employeeService.delete();
                                break;
                            case "4":
                                employeeService.edit();
                                break;
                            case "5":
                                displayMainMenu();
                            default:
                                System.out.println("vui long nhap dung lua chon tu 1 => 5\n" +
                                        "Xin cam on");
                        }

                    } while (true);

                case "2":
                    System.out.println("1.Display list custom\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu\n" +
                            "5.Exit");
                    String chooseCase2=scanner.nextLine();
                    switch (chooseCase2){
                        case "1":
                            customerService.display();
                            break;
                        case "2":
                            customerService.add();
                            break;
                        case "3":
                            customerService.edit();
                            break;
                        case "4":
                            displayMainMenu();
                        case "5":
                            System.exit(1);
                        default:
                            System.out.println("vui long nhap dung lua chon tu 1 => 5\n" +
                                    "Xin cam on");
                    }
                    break;
                case "3":
                    String chooseCase3;
                    System.out.println("1.Display list facility\n" +
                            "2.Add new facility\n" +
                            "3.Display list facility maintenance\n" +
                            "4.Return main menu\n" +
                            "5.Exit");
                    chooseCase3= scanner.nextLine();
                    switch (chooseCase3){
                        case "1":
                        case "2":
                            System.out.println("moi ban chon dich vu them\n" +
                                    "1.them room\n" +
                                    "2.them villa");
                            String chooses = null;
                            switch (chooses){
                                case "1":
                                    facilityService.addRoom();
                                    break;
                                case "2":
                                    facilityService.addVilla();
                                    break;
                                default:
                                    System.out.println("moi ban nhap lua chon tu 1 => 2");
                            }

                    }
                    break;
                case "4":
                    System.out.println("1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Return list menu\n" +
                            "4.Exit");
                    break;
                case "5":
                    break;
                case "6":
                    System.exit(1);
                default:
                    System.out.println("vui long nhap dung lua chon tu 1 => 6\n" +
                            "Xin cam on");
            }
        } while (true);
    }

    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }
}
