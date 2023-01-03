package ss3_mang.bai_tap.bai_1;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length: ");
        length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Input " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Enter the number you want to delete: ");
        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                count++;
                for (int j = i + 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[length - count] = 0;
                i--;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
