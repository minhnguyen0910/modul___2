package home_work.factory;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cadred> myList = new ArrayList<>();
        byte number;


        do {
            System.out.println("Nhap lua chon\n" +
                    "1.Them ki su\n" +
                    "2.Them cong nhan\n" +
                    "3.Them nhan vien\n" +
                    "4.Tim kiem thong tin cong can bo\n" +
                    "5.Hien thi thong tin can bo\n" +
                    "6.Sap Xep Theo Ten\n" +
                    "7.Thoat");
             number = Byte.parseByte(scanner.nextLine());
            switch (number) {
                case 1: {
                    System.out.println("nhap ten ki su");
                    String name = scanner.nextLine();
                    System.out.println("nhap tuoi ki su");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap gioi tinh");
                    String sex = scanner.nextLine();
                    System.out.println("nhap dia chi");
                    String address = scanner.nextLine();
                    System.out.println("nhap nganh dao tao");
                    String trainingIndustry = scanner.nextLine();
                    Cadred engineer = new Engineer(name, year, sex, address, trainingIndustry);
                    myList.add(engineer);
                    break;
                }
                case 2:{
                    System.out.println("nhap ten cong nhan");
                    String name = scanner.nextLine();
                    System.out.println("nhap tuoi cong nhan");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap gioi tinh");
                    String sex = scanner.nextLine();
                    System.out.println("nhap dia chi");
                    String address = scanner.nextLine();
                    System.out.println("nhap kieu cong nhan");
                    String typeOW = scanner.nextLine();
                    Cadred worker = new Worker(name, year, sex, address, typeOW);
                    myList.add(worker);
                    break;
                }
                case 3:{
                    System.out.println("nhap ten nhan vien");
                    String name = scanner.nextLine();
                    System.out.println("nhap tuoi nhan vien");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap gioi tinh");
                    String sex = scanner.nextLine();
                    System.out.println("nhap dia chi");
                    String address = scanner.nextLine();
                    System.out.println("nhap cong viec");
                    String job = scanner.nextLine();
                    Cadred staff = new Staff(name,year,sex,address,job);
                    myList.add(staff);
                    break;
                }
                case 4:{
                    System.out.println("nhap ten tim kiem");
                    String name=scanner.nextLine();
                    for (int i=0; i<myList.size();i++){
                        if (name.equals(myList.get(i).getName())){
                            System.out.println(myList.get(i));
                        }
                    }
                    break;
                }
                case 5:{
                    for (int i=0; i<myList.size();i++){
                        System.out.println(myList.get(i));
                    }
                    break;
                }
                case 6:{
                    myList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
                    break;
                }
            }
        }while (number > 0 && number <8);
    }
}
