package casetudy.controller;

import casetudy.servives.BookingServiceImpl;

import java.util.Scanner;

public class BookingController {
    public void displayBookingController(){
        Scanner scanner= new Scanner(System.in);
        BookingServiceImpl bookingService=new BookingServiceImpl();
        FuramaController furamaController= new FuramaController();
        do {
            System.out.println("1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Return list menu\n" +
                    "4.Exit");
            String chooseOfCase4 = scanner.nextLine();
            switch (chooseOfCase4) {
                case "1":
                    bookingService.addBooking();
                    break;
                case "2":
                    bookingService.displayBooking();
                    break;
                case "3":
                    furamaController.displayMainMenu();
                    break;
                case "4":
                    System.exit(1);
                    break;
                default:
                    System.out.println("vui long nhap lua chon tu 1 => 4");
            }
        }while (true);
    }
}
