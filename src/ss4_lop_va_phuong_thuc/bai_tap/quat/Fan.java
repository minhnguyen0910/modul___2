package ss4_lop_va_phuong_thuc.bai_tap.quat;

public class Fan {
    int speed = 3;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;

    }
}
//    public int speedUP() {
//        if (this.speed < 3) {
//            this.speed++;
//            return this.speed;
//        }
//
//        public int speedLow () {
//            if (this.speed < 0 && this.speed <= 3) {
//                this.speed--;
//                return speed;
//            }
//        }
//    }

