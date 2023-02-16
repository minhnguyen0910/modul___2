package casetudy.controller;

import casetudy.servives.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    public void displayCustomerController(){
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        FuramaController furamaController=new FuramaController();
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("1.Display list custom\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n" +
                    "5.Exit");
            String chooseCase2 = scanner.nextLine();
            switch (chooseCase2) {
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
                  furamaController.displayMainMenu();
                case "5":
                    System.exit(1);
                default:
                    System.out.println("vui long nhap dung lua chon tu 1 => 5\n" +
                            "Xin cam on");
            }
        } while (true);
    }
}
