package giai_thuat;

import java.util.Scanner;

public class fgdfgd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap do dai");
        int size=Integer.parseInt(scanner.nextLine());
        int[] mang= new int[size];
        for (int i=0; i<size; i++){
            System.out.println("nhap phan tu thu"+(i+1));
            mang[i]=Integer.parseInt(scanner.nextLine());
        }
       for (int i=0; i<size; i++){
           System.out.print(mang[i]+" ");
       }
    }
}
