package ss1_introduction_java.bai_tap.bai_1;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
