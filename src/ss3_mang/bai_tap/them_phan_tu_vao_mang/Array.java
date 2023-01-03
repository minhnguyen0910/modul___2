package ss3_mang.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Input element ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Input number ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Index ");
        int index = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length + 1];
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                arr[i] = number;
            } else {
                arr[i] = array[i];
            }
        }
        for (int i = index; i < length; i++) {
            arr[i + 1] = array[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
