package ss6_ke_thua.bai_tap.circle_cylinder;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return acreage() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", color= " + getColor() +
                ", volume=" + getVolume() +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = Double.parseDouble(scanner.nextLine());

        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Height: ");
        double height = Double.parseDouble(scanner.nextLine());
        Cylinder cylinder = new Cylinder(height, radius, color);
        System.out.println(cylinder);
    }
}

