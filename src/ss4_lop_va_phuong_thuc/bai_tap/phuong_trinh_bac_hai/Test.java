package ss4_lop_va_phuong_thuc.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a = ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Input b = ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Input c = ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.print("Inexperienced method");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("The solution of the equation is = " + quadraticEquation.getRoot());

        } else {
            System.out.print("The solution of the equation is x1 = " + quadraticEquation.getRoot1() + "x2 = " + quadraticEquation.getRoot2());

        }
    }
}
