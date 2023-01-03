package ss3_mang.bai_tap.dem_so_lan_xuat_hien;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string");
        String string = scanner.nextLine();
        System.out.print("Enter the character to be checked ");
        String character = scanner.nextLine();
        String[] arr = new String[string.length()];
        arr = string.split("");
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            if (arr[i].equals(character)) {
                count++;
            }
        }
        System.out.print(count);
    }
}
