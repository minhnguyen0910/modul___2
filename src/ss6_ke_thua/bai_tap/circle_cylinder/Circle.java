package ss6_ke_thua.bai_tap.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double acreage() {
        return Math.PI * this.radius * this.radius;
    }
}
