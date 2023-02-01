package ss13_thuat_toan_tim_kiem.search;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int num = Integer.parseInt(scanner.nextLine());
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("moi ban nhap phan tu thu " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("moi ban nhap gi tri can tim");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println(Binary.binarySearch(array, value));
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (value == array[middle]) {
                return middle;
            } else if (value < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
