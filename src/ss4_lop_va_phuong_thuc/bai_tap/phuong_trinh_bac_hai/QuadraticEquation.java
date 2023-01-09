package ss4_lop_va_phuong_thuc.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

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


}

