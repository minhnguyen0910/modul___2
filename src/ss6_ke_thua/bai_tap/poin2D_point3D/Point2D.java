package ss6_ke_thua.bai_tap.poin2D_point3D;

import java.util.Scanner;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {

    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double[] getXY() {
        double[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
