package ss4_lop_va_phuong_thuc.bai_tap.quat;

public class Fan {
    int speed;
    boolean on;
    double radius;
    String color;

    public Fan() {
        this.radius = 5;
        this.color = "blue";
        this.on = false;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan = new Fan(3, true, 10, "yelow");
        Fan fan1 = new Fan(2, false, 5, "blue");
        System.out.println(fan.toString());
        System.out.println(fan1.toString());

    }


}


