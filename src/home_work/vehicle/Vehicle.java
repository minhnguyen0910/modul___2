package home_work.vehicle;

public class Vehicle {
    private double capacity;
    private double value;

    public Vehicle(double capacity, double value) {
        this.capacity = capacity;
        this.value = value;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double registrationFee() {
        if (this.capacity <= 100) {
            return value * 0.01;
        } else if (this.capacity <= 200) {
            return value * 0.03;
        } else {
            return value * 0.05;
        }
    }
}
