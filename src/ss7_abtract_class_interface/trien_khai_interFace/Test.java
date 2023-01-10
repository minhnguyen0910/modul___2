package ss7_abtract_class_interface.trien_khai_interFace;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", 7);
        shapes[1] = new Rectangle("green", 4, 5);
        shapes[2] = new Square("red", 10);

        System.out.println("Pre-sorted:");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Before " + ((Circle) shape).getArea());
                System.out.println("After " + ((Circle) shape).resize());
            } else if (shape instanceof Rectangle) {
                System.out.println("Before " + ((Rectangle) shape).getArea());
                System.out.println("After " + ((Rectangle) shape).resize());
            } else {
                System.out.println("Before " + ((Square) shape).getArea());
                System.out.println("After " + ((Square) shape).resize());
            }
        }
    }
}
