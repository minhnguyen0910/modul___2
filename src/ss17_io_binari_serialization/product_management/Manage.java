package ss17_io_binari_serialization.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    public static void addWrite() throws IOException {
        System.out.println("Moi ban nhap ma san pham");
        int productCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Moi ban nhap ten nha san xuat");
        String manufacturerName = scanner.nextLine();
        System.out.println("Moi ban nhap gia");
        Double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(productCode, name, manufacturerName, price);
        productList.add(product);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss17_io_binari_serialization\\product_management\\product.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(productList);
        objectOutputStream.close();
    }

    public static void display() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss17_io_binari_serialization\\product_management\\product.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> productList1 = (List<Product>) objectInputStream.readObject();
        System.out.println(productList1 + "\n");
        objectInputStream.close();
    }

    public static void search() throws IOException, ClassNotFoundException {
        System.out.println("moi ban nhap ten san pham");
        String name = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss17_io_binari_serialization\\product_management\\product.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> productList1 = (List<Product>) objectInputStream.readObject();
        for (Product i : productList1) {
            if (name.contains(i.getName())) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String choose;
        do {
            System.out.println("moi ban nhap lua chon\n" +
                    "1.Them san pham\n" +
                    "2.Hien thi san pham\n" +
                    "3.Tim kiem san pham theo ten\n" +
                    "4.Exit");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addWrite();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    search();
                    break;
                case "4":
                    System.exit(1);
                default:
                    System.out.println("lua chon tu 1=> 4");
            }
        } while (true);
    }
}
