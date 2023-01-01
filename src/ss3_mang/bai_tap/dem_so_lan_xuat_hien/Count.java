package ss3_mang.bai_tap.dem_so_lan_xuat_hien;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string");
        String string=scanner.nextLine();
        System.out.print("Enter the character to be checked ");
        String character=scanner.nextLine();
        int count=0;
        for (int i=0;i<string.length();i++){
            if (string[i]==character){
                count++;
            }

        }
    }
}
