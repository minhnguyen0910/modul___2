package home_work.hoc_sinh;

public class Students {
    String name;
    int ages;
    String homeTown;
    int yearOfBirth;

    public Students(String name, int ages, String homeTown, int yearOfBirth) {
        this.name = name;
        this.ages = ages;
        this.homeTown = homeTown;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
