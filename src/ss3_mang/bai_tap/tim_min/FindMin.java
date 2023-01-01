package ss3_mang.bai_tap.tim_min;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input cow = ");
        int cow = Integer.parseInt(scanner.nextLine());
        System.out.print("Input row = ");
        int row = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[cow][row];
        for (int i = 0; i < cow; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Input element " + i + " " + j + " ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.print("Min = " + min);
    }
}
