package casetudy.controller;

import casetudy.models.Employee;
import casetudy.servives.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public void displayEmployeeController(){
        Scanner scanner=new Scanner(System.in);
        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
        FuramaController furamaController=new FuramaController();
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
                    employeeService.remove();
                    break;
                case "4":
                    employeeService.edit();
                    break;
                case "5":
                   furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("vui long nhap dung lua chon tu 1 => 5\n" +
                            "Xin cam on");
            }

        } while (true);
    }
}
