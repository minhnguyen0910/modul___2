package giai_thuat;

import java.util.Scanner;

public class Array {
    public static boolean isPrime(int[] arr) {
        boolean flag = false;
        for (int i = 1; i < arr.length - 1; i++) {
            int sum = 0;
            int sum1 = 0;
            for (int j = 0; j < i; j++) {
                sum += arr[j];
            }
            for (int z = i + 1; z < arr.length; z++) {
                sum1 += arr[z];

            }
            if (sum == sum1) {
                flag = true;
                return flag;

            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int array[]= {1,1,2,2};
        System.out.println(isPrime(array));
    }
}
