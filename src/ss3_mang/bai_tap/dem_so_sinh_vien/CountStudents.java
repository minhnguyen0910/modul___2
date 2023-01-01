package ss3_mang.bai_tap.dem_so_sinh_vien;

import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Numbers: ");
        int num = Integer.parseInt(scanner.nextLine());
        double[] array = new double[num];
        int count = 0;
        for (int i = 0; i < num; i++) {
            do {
                System.out.print("Enter students score: ");
                array[i] = Integer.parseInt(scanner.nextLine());
                if (array[i] > 10 || array[i] < 0) {
                    System.out.print("Enter students score again: ");
                    array[i] = Integer.parseInt(scanner.nextLine());
                }
            } while (array[i] > 10 || array[i] < 0);

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                count++;
            }
        }
        System.out.print("Number of students passing = " + count);
    }
}
