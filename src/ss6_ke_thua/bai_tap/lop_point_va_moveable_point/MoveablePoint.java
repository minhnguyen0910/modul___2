package ss6_ke_thua.bai_tap.lop_point_va_moveable_point;

import ss3_mang.bai_tap.bai_1.Array;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public float[] move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return new float[]{super.getX(), super.getY()};
    }

    public String toString() {
        return Arrays.toString(move());
    }



}
