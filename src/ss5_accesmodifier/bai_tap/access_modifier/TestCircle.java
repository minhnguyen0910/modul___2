package ss5_accesmodifier.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(4.0, "green");
        System.out.println(circle1);
    }
}
