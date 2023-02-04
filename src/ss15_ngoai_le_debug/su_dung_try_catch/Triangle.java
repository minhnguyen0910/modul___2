package ss15_ngoai_le_debug.su_dung_try_catch;

import java.util.Scanner;

public class Triangle {
    public static void check(int num1, int num2, int num3) throws IllegalTriangleException {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            throw new IllegalTriangleException("khong duoc nhap so am");
        } else if ((num1 + num2) <= num3 || (num2 + num3) <= num1 || (num1 + num3) <= num2) {
            throw new IllegalTriangleException("tong cua hai canh phai lon hon canh con lai");
        } else {
            System.out.println("day la 3 canh cua tam giac");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            try {
                System.out.println("nhap canh thu nhat");
                int num1 = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap canh thu hai");
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap canh thu 3");
                int num3 = Integer.parseInt(scanner.nextLine());
                check(num1, num2, num3);
                flag = false;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("khong duoc nhap chu");
                flag = true;
            }
        } while (flag);
    }
}
