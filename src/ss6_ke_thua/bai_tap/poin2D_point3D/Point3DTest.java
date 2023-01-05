package ss6_ke_thua.bai_tap.poin2D_point3D;

import java.util.Scanner;

public class Point3DTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Y: ");
        double y = Double.parseDouble(scanner.nextLine());
        System.out.println("Z: ");
        double z = Double.parseDouble(scanner.nextLine());
        Point3D point3D = new Point3D(z, x, y);
        System.out.println(point3D);
    }
}
