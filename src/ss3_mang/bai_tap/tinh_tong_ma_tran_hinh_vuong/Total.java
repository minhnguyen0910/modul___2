package ss3_mang.bai_tap.tinh_tong_ma_tran_hinh_vuong;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length ");
        int length = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("Input element " + i + " " + j + " ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        int sum1 = 0;
        int x = array.length - 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    sum += array[i][j];
                }
                if (j == x) {
                    x--;
                    sum1 += array[i][j];

                }
            }
        }
        System.out.print("Total = " + sum + " and " + sum1);
    }
}
