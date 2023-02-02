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
        System.out.println(binarySearch(array, value, 0, num));
    }

    public static int binarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (right - left) / 2;
        if (array[middle] == value) {
            return middle;
        }
        if (array[middle] > value) {
            return binarySearch(array, value, left, middle - 1);
        }
        return binarySearch(array, value, middle + 1, right);
    }
}
