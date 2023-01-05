package ss3_mang.bai_tap.tinh_tong;

import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input row ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Input cow ");
        int cow = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[row][cow];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                System.out.print("Input element " + i + " " + j + " ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.print("Enter the column you want to sum: ");
        int colum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += array[i][colum];
        }
        System.out.print("Total = " + sum);
    }
}
