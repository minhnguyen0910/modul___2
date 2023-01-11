package ss7_abtract_class_interface.trien_khai_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("red", 10);
        shapes[1] = new Square("green", 20);
        shapes[2] = new Rectangle("black", 4, 5);
        shapes[3]= new Rectangle("sd",5,6);
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                if (shape instanceof Circle) {
                    System.out.println(((Circle) shape).getArea());
                    System.out.println(((Circle) shape).howToColor());
                } else {
                    System.out.println(((Square) shape).getArea());
                    System.out.println(((Square) shape).howToColor());
                }
            } else {
                System.out.println(shape.getArea());
            }
        }
    }
}

