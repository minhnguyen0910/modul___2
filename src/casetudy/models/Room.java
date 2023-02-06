package casetudy.models;

public class Room extends Facility{
    String freeServiceIncluded;

    public Room(String serviceName, Double usableArea, Double rentalCost, int maximum, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCost, maximum, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maximum=" + maximum +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
