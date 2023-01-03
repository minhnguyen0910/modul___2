package ss3_mang.bai_tap.gop_mang;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array length 1:  ");
        int length1 = Integer.parseInt(scanner.nextLine());
        int arr1[] = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.print("Input element " + i + " ");
            arr1[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.print("Input array length 1:  ");
        int length2 = Integer.parseInt(scanner.nextLine());
        int arr2[] = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.print("Input element " + i + " ");
            arr2[i] = Integer.parseInt(scanner.nextLine());

        }
        int[] arr = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < length2; i++) {
            arr[length1 + i] = arr2[i];
        }
        for (int i = 0; i < length1 + length2; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
