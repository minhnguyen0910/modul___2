package ss7_abtract_class_interface.trien_khai_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("red", 10);
        shapes[1] = new Square("green", 20);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println(((Circle) shape).howToColor());
            } else {
                System.out.println(((Square) shape).howToColor());
            }
        }
    }
}

