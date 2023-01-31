package ss12_collection_framework.luyen_tap.controller;

import ss12_collection_framework.luyen_tap.service.IProductMangament;
import ss12_collection_framework.luyen_tap.service.ProductManagement;

import java.util.Scanner;

public class Display {
    static void menu() {
        Scanner scanner = new Scanner(System.in);
        IProductMangament iProductMangament = new ProductManagement();
        int choose;
        do {
            System.out.println("nhap lua chon cua ban\n" +
                    "1. them san pham\n" +
                    "2. sua thong tin san pham\n" +
                    "3. xoa san pham\n" +
                    "4. hien thi danh sach san pham\n" +
                    "5. tim kiem san pham\n" +
                    "6. sap xep san pham\n" +
                    "7. thoat");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductMangament.add();
                    break;
                case 2:
                    iProductMangament.edit();
                    break;
                case 3:
                    iProductMangament.remove();
                    break;
                case 4:
                    iProductMangament.disPlays();
                    break;
                case 5:
                    iProductMangament.search();
                    break;
                case 6:
                    iProductMangament.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ngu");
            }
        } while (true);
    }

    public static void main(String[] args) {
        Display.menu();
    }
}
