package ss7_abtract_class_interface.trien_khai_interFace;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", 7);
        shapes[1] = new Rectangle("green", 4, 5);
        shapes[2] = new Square("red", 10);

        System.out.println("Pre-sorted:");
        for (Shape shape : shapes) {
            System.out.println("Before " + shape.getArea());
            System.out.println("After " + shape.resize());
        }
    }
}
