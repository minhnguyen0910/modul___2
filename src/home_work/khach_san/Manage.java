package home_work.khach_san;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hotel> hotelArrayList = new ArrayList<>();
        int guestNumber;
        int num;
        do {
            System.out.println("Nhap lua chon cua ban\n" +
                    "1.Nhap thong tin khach hang\n" +
                    "2.Hien thi thong tin khach hang\n" +
                    "3.Thoat");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1: {
                    System.out.println("Nhap so luong khach hang");
                    guestNumber = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < guestNumber; i++) {
                        System.out.println("Ten");
                        String name = scanner.nextLine();
                        System.out.println("Tuoi");
                        int ages = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nam Sinh");
                        int years = Integer.parseInt(scanner.nextLine());
                        System.out.println("So Can Cuoc Cong Dan");
                        int citizenIdentificationNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println("So Ngay");
                        int numbersOfDay = Integer.parseInt(scanner.nextLine());
                        System.out.println("Loai Phong");
                        String kindOfRoom = scanner.nextLine();
                        System.out.println("Gia Phong");
                        int roomRates = Integer.parseInt(scanner.nextLine());
                        Hotel guest = new Hotel(name, ages, years, citizenIdentificationNumber, numbersOfDay, kindOfRoom, roomRates);
                        hotelArrayList.add(guest);

                    }break;
                }
                case 2: {
                    for (int i = 0; i < hotelArrayList.size(); i++) {
                        System.out.println(hotelArrayList.get(i));
                    }
                    break;
                }
            }
        } while (num < 3);
    }
}
