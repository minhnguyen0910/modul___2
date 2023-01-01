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
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your chose");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (i = 0; i < 5; i++) {
                        for (j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (i = 0; i < 5; i++) {
                        for (j = 4; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (z = 0; z <= i; z++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (i = 0; i < 5; i++) {
                        for (j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (z = 5; z > i; z--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (i = 0; i < 5; i++) {
                        for (j = 4; j > i; j--) {
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
