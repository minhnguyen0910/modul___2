package ss2_vong_lap.bai_tap.bai_1;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int j = 0;
        int z = 0;
        int num;

        do {
            System.out.println("1.Print the rectangle \n" +
                    "2.Print the square triangle \n" +
                    "3.Print isosceles triangle \n" +
                    "4.Exit \n" +
                    "Enter your chose");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    System.out.print("Input height: ");
                    int height = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input width: ");
                    int width = Integer.parseInt(scanner.nextLine());
                    for (i = 0; i < height; i++) {
                        for (j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.print("Input height: ");
                    int height1 = Integer.parseInt(scanner.nextLine());
                    for (i = 0; i < height1; i++) {
                        for (j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (i = 0; i < height1; i++) {
                        for (j = height1; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (i = 0; i < height1; i++) {
                        for (j = height1 - 1; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (z = 0; z <= i; z++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (i = 0; i < height1; i++) {
                        for (j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (z = height1; z > i; z--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.print("Input height: ");
                    int height2 = Integer.parseInt(scanner.nextLine());
                    for (i = 0; i < height2; i++) {
                        for (j = height2 - 1; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (z = 0; z <= i * 2; z++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
            }
        } while (num > 0 && num < 4);
    }
}
