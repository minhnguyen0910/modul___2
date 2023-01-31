package ss12_collection_framework.luyen_tap.service;

import java.util.*;

public class ProductManagement implements IProductMangament {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> arrayList = new ArrayList<>();

    public void add() {
        System.out.println("ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ten San Pham");
        String name = scanner.nextLine();
        System.out.println("gia san pham");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        arrayList.add(product);
    }

    public void remove() {
        System.out.println("Nhap id can xoa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(arrayList.get(i));
            }
        }
    }

    @Override
    public void disPlays() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    @Override
    public void edit() {
        System.out.println("nhap id can sua");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten san pham update");
        String name = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.get(i).setName(name);
            }
        }
    }

    @Override
    public void sort() {
        Tang tang = new Tang();
        arrayList.sort(tang);
    }

    public void search() {
        System.out.println("nhap tu can tim kiem");
        String characters = scanner.nextLine();
        boolean flag = true;
        for (Product product : arrayList) {
            if (product.getName().toLowerCase().contains(characters.toLowerCase())) {
                System.out.println(product);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("tu can tim khong ton tai");
        }
    }

}
