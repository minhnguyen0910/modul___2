package ss7_abtract_class_interface.trien_khai_colorable;

public class Circle extends Shape implements Colorable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPrimeter() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    public String howToColor() {
        return "pain in a circle";
    }

    @Override
    public String toString() {
        return "Area = " + getArea();
    }
}
