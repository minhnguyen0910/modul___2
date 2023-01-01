package ss1_introduction_java.bai_tap.bai_2;

import java.util.Scanner;

public class ConvertNumbersToLetters {
    static void checkNum1(int number) {
        switch (number) {
            case 0:
                System.out.print("Zero");
                break;
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
        }
    }

    static void checkNum2(int number) {
        checkNum1(number / 10);
        System.out.print("ty");
        checkNum1(number % 10);
    }

    public static void main(String[] args) {
        System.out.print("Input number:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 0 && number <= 10) {
            checkNum1(number);
        } else if (number < 20) {
            checkNum1(number);
            System.out.print("teen");
        } else if (number < 30) {
            System.out.print("Twenty");
            checkNum1(number % 10);
        } else {
            checkNum2(number);
        }
    }

}
