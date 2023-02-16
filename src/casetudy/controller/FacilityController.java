package casetudy.controller;

import casetudy.servives.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityController {
    public void displayFacilityController(){
        FacilityServiceImpl facilityService=new FacilityServiceImpl();
        Scanner scanner= new Scanner(System.in);
        FuramaController furamaController=new FuramaController();
        do {
            String chooseCase3;
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n" +
                    "5.Exit");
            chooseCase3 = scanner.nextLine();
            switch (chooseCase3) {
                case "1":
                    System.out.println("moi chon danh sach hien thi\n" +
                            "1.villa\n" +
                            "2.room");
                    String choosess = scanner.nextLine();
                    switch (choosess) {
                        case "1":
                            facilityService.displayListVilla();
                            break;
                        case "2":
                            facilityService.disPlayListRoom();
                            break;
                        default:
                            System.out.println("vui long nhap lua chon tu 1 => 2");
                    }
                    break;

                case "2":
                    System.out.println("moi ban chon dich vu them\n" +
                            "1.them room\n" +
                            "2.them villa");
                    String chooses = scanner.nextLine();
                    switch (chooses) {
                        case "1":
                            facilityService.addRoom();
                            break;
                        case "2":
                            facilityService.addVilla();
                            break;
                        default:
                            System.out.println("moi ban nhap lua chon tu 1 => 2");
                    }
                    break;
                case "3":
                    facilityService.maintenance();
                    break;
                case "4":
                   furamaController.displayMainMenu();
                   break;
                case "5":
                    System.exit(1);
            }
        }while (true);
    }
}
