package ss4_lop_va_phuong_thuc.bai_tap.quat;

public class Fan {
    byte speed = 3;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan() {
    }

    public Fan(byte speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;

    }
//    public String display(){
//        return
//    }

    public byte speedUp() {
        this.speed++;
        return this.speed;
    }

    public byte speedLow() {
        this.speed--;
        return this.speed;
    }


}


