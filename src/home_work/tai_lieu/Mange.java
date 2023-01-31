package home_work.tai_lieu;

import java.util.ArrayList;
import java.util.Scanner;

public class Mange {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Document> documents = new ArrayList<>();

    private static void addBooks() {

        System.out.println("moi ban nhap ma tai lieu");
        int documentCode = Integer.parseInt(scanner.nextLine());
        System.out.println("mai ban nhap ten nha san xuat");
        String manufacturersName = scanner.nextLine();
        System.out.println("moi ban nhap so ban phat hanh");
        int numberOfEditions = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten tac gia");
        String theWriterName = scanner.nextLine();
        System.out.println("nhap so trang");
        int numbersOfPage = Integer.parseInt(scanner.nextLine());
        Document book = new Books(documentCode, manufacturersName, numberOfEditions, theWriterName, numbersOfPage);
        documents.add(book);
    }

    private static void addMagazine() {
        System.out.println("moi ban nhap ma tai lieu");
        int documentCode = Integer.parseInt(scanner.nextLine());
        System.out.println("mai ban nhap ten nha san xuat");
        String manufacturersName = scanner.nextLine();
        System.out.println("moi ban nhap so ban phat hanh");
        int numberOfEditions = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so phat hanh");
        int issueNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap thang phat hanh");
        int releaseMonth = Integer.parseInt(scanner.nextLine());
        Document magazine = new Magazine(documentCode, manufacturersName, numberOfEditions, issueNumber, releaseMonth);
        documents.add(magazine);
    }

    private static void addNewpapes() {
        System.out.println("moi ban nhap ma tai lieu");
        int documentCode = Integer.parseInt(scanner.nextLine());
        System.out.println("mai ban nhap ten nha san xuat");
        String manufacturersName = scanner.nextLine();
        System.out.println("moi ban nhap so ban phat hanh");
        System.out.println("nhap ngay phat hanh");
        System.out.println("moi ban nhap so ban phat hanh");
        int numberOfEditions = Integer.parseInt(scanner.nextLine());
        int releaseDate = Integer.parseInt(scanner.nextLine());
        Document newspaper = new Newspaper(documentCode, manufacturersName, numberOfEditions, releaseDate);
        documents.add(newspaper);
    }

    private static void display() {
        for (int i = 0; i < documents.size(); i++) {
            System.out.println(documents.get(i));
        }
    }

    private static void searchBooks() {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i) instanceof Books) {
                System.out.println(documents.get(i));
            }
        }
    }

    private static void searchNewspapers() {
        for (Document document : documents) {
            if (document instanceof Newspaper) {
                System.out.println(document);
            }
        }
    }

    private static void searchMagazine() {
        for (Document document : documents) {
            if (document instanceof Magazine) {
                System.out.println(document);
            }
        }
    }

    public static void main(String[] args) {
      int   number;
        do {

            System.out.println("Nhap lua chon cua ban:\n" +
                    "1.Them sach\n" +
                    "2.Them tap chi\n" +
                    "3.Them bao\n" +
                    "4.Hien thi\n" +
                    "5.Hien thi cac loai sach\n" +
                    "6.Hien thi cac laoi tap chi\n" +
                    "7.Hien thi cac loaii bao\n" +
                    "8.Thoat");
            number=Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:{
                    Mange.addBooks();
                    break;
                }
                case 2:{
                    Mange.addMagazine();
                    break;
                }
                case 3:{
                    Mange.addNewpapes();
                    break;
                }
                case 4:{
                    Mange.display();
                    break;
                }
                case 5:{
                    Mange.searchBooks();
                    break;
                }
                case 6:{
                    Mange.searchMagazine();
                    break;
                }
                case 7:{
                    Mange.searchNewspapers();
                    break;
                }
            }
        }while (number<8);
    }
}
