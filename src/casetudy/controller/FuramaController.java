package casetudy.controller;

import java.util.Scanner;

public class FuramaController {

     public void displayMainMenu() {
        BookingController bookingController = new BookingController();
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        PromotionController promotionController = new PromotionController();
        Scanner scanner = new Scanner(System.in);
        String choose;

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
                    employeeController.displayEmployeeController();
                    break;
                case "2":
                    customerController.displayCustomerController();
                    break;
                case "3":
                    facilityController.displayFacilityController();
                    break;
                case "4":
                    bookingController.displayBookingController();
                    break;
                case "5":
                    promotionController.displayPromotionController();
                    break;
                case "6":
                    System.exit(1);
                    break;
                default:
                    System.out.println("vui long nhap dung lua chon tu 1 => 6\n" +
                            "Xin cam on");
            }
        } while (true);
    }
}
