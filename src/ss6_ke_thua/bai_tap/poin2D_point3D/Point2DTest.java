package ss6_ke_thua.bai_tap.poin2D_point3D;

import java.util.Scanner;

public class Point2DTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Y: ");
        double y = Double.parseDouble(scanner.nextLine());
        Point2D point2D = new Point2D(x, y);
        System.out.println(point2D);
    }
}
