package ss7_abtract_class_interface.trien_khai_colorable;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract public double getArea();

    abstract public double getPrimeter();

}
