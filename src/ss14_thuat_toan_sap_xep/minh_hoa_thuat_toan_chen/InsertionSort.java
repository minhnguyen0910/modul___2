package ss14_thuat_toan_tim_kiem.minh_hoa_thuat_toan_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 1, 5, 2, 9, 6};
        InsertionSort.sort(array);
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i - 1;
            for (; k >= 0 && arr[k] > temp; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
