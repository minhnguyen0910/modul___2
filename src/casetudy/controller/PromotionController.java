package casetudy.controller;

import casetudy.servives.PromotionServiceImpl;

import java.util.Scanner;

public class PromotionController {
    public void displayPromotionController() {
        PromotionServiceImpl promotionService = new PromotionServiceImpl();
        FuramaController furamaController = new FuramaController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu");
            String chooseOfCase5 = scanner.nextLine();
            switch (chooseOfCase5) {
                case "1":
                    promotionService.showCustomers();
                    break;
                case "2":
                    promotionService.checkPromotion();
                    break;
                case "3":
                    furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("vui long nhap lua chon tu 1 => 3");
            }
        } while (true);
    }
}
