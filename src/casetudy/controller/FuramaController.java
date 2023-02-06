package casetudy.controller;

import casetudy.servives.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        do {
            System.out.println("nhap lua chon cua ban\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            choose= Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    do {
                        System.out.println("1.Display list employees\n" +
                                "2.Add new employees\n" +
                                "3.Delete employees\n" +
                                "4.Edit employees\n" +
                                "5.Return main menu\n");
                        int chooseCase1=0;
                        try {
                            System.out.println("moi nhap lua chon");
                            chooseCase1 = Integer.parseInt(scanner.nextLine());
                        }catch (NumberFormatException e){
                            e.getStackTrace();
                        }
                        switch (chooseCase1) {
                            case 1:
                                employeeService.display();
                                break;
                            case 2:
                                employeeService.add();
                                break;
                            case 3:
                                employeeService.delete();
                                break;
                            case 4:
                                employeeService.edit();
                                break;
                            case 5:
                                displayMainMenu();
                            default:
                                System.out.println("vui long nhap lua chon tu 1=>5");
                        }

                    } while (true);

                case 2:
                    System.out.println("1.Display list custom\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu\n" +
                            "5.Exit");
                case 3:
                    System.out.println("1.Display list facility\n" +
                            "2.Add new facility\n" +
                            "3.Display list facility maintenance\n" +
                            "4.Return main menu\n" +
                            "5.Exit");
                case 4:
                    System.out.println("1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Return list menu\n" +
                            "4.Exit");
                case 5:
            }
        }while (true);
    }

    public static void main(String[] args) {
displayMainMenu();
    }
}
