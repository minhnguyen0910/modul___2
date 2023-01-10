package ss7_abtract_class_interface.trien_khai_interFace;

public class Rectangle extends Shape implements Resizeable {
    private double x;
    private double y;

    public Rectangle(String color, double x, double y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getArea() {
        return x * y;
    }

    @Override
    public double getPrimeter() {
        return (x + y) * 2;
    }

    @Override
    public double resize() {
        double z = Math.random();
        setX(getX() + z);
        setY(getY() + z);
        return getArea();
    }

}
