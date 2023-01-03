package ss3_mang.bai_tap.tim_max;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length array: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Input length array");
        int length1 = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[length][length1];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length1; j++) {
                System.out.println("Input element " + i + " " + j);
                array[i][j] = Integer.parseInt(scanner.nextLine());

            }
        }
        int max = array[0][0];
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexI = i;
                    indexJ = j;
                }

            }
        }
        System.out.println("Max = " + max);
        System.out.println("Index = " + "[" + indexI + "]" + "[" + indexJ + "]");

    }
}
