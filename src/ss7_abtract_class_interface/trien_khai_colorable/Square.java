package ss7_abtract_class_interface.trien_khai_colorable;


public class Square extends Shape {
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
    public String howToColor() {
        return "paint in a square";
    }

}
