package home_work.khach_san;

public class Hotel extends Guest{
    int numbersOfDay;
    String kindOfRoom;
    int roomRates;

    public Hotel(String name, int ages, int yearOfBirth, int citizenIdentificationNumber, int numbersOfDay, String kindOfRoom, int roomRates) {
        super(name, ages, yearOfBirth, citizenIdentificationNumber);
        this.numbersOfDay = numbersOfDay;
        this.kindOfRoom = kindOfRoom;
        this.roomRates = roomRates;
    }

    public int getNumbersOfDay() {
        return numbersOfDay;
    }

    public void setNumbersOfDay(int numbersOfDay) {
        this.numbersOfDay = numbersOfDay;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public int getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(int roomRates) {
        this.roomRates = roomRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "numbersOfDay=" + numbersOfDay +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", roomRates=" + roomRates +
                ", name='" + name + '\'' +
                ", ages=" + ages +
                ", yearOfBirth=" + yearOfBirth +
                ", citizenIdentificationNumber=" + citizenIdentificationNumber +
                '}';
    }
}
