package ss7_abtract_class_interface.trien_khai_interFace;

public abstract class Shape implements Resizeable {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract public double getArea();

    abstract public double getPrimeter();


}
