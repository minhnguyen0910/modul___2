package home_work.vehicle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        double x = 0;
        do {
            System.out.println("Input your choose:\n" +
                    "1: Enter vehicle information\n" +
                    "2: Show tax money\n" +
                    "3: Exit");
            num = Integer.parseInt(scanner.nextLine());
            if (num == 1) {
                System.out.println("Input capacity");
                double capacity = Double.parseDouble(scanner.nextLine());
                System.out.println("Input value");
                double value = Double.parseDouble(scanner.nextLine());
                Vehicle vehicle = new Vehicle(capacity, value);
                x = vehicle.registrationFee();
            } else if (num == 2) {
                System.out.println("your tax is");
                System.out.println(x);
            }
        } while (num > 0 && num < 3);
    }
}
