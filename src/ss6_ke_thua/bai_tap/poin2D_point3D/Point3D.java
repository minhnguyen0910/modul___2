package ss6_ke_thua.bai_tap.poin2D_point3D;

import ss6_ke_thua.bai_tap.circle_cylinder.Cylinder;

import java.sql.Array;
import java.util.Scanner;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {

    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(double z, double x, double y) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        super.setXY(x, y);
        this.z = z;

    }

    public double[] getXYZ() {
        double[] array = {getX(), getY(), getZ()};
        return array;

    }

    @Override
    public String toString() {
        return "Point3D " +
                "coordinates=" + "(" + getX() + "," + getY() + "," + getZ() + ")" + "";
    }
}
