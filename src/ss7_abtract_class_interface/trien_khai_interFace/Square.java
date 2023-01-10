package ss7_abtract_class_interface.trien_khai_interFace;

public class Square extends Shape implements Resizeable {
    private double a;

    public Square(String color, double a) {
        super(color);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPrimeter() {
        return a * 4;
    }

    @Override
    public double resize() {
        double z = Math.random();
        setA(getA() + z);
        return getArea();
    }
}
