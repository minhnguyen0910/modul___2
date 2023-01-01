package ss4_lop_va_phuong_thuc.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot() {
        return (-this.b / (2 * this.a));

    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);

    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * a);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a = ");
        double a = scanner.nextDouble();
        System.out.print("Input b = ");
        double b = scanner.nextDouble();
        System.out.print("Input c = ");
        double c = scanner.nextDouble();
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

