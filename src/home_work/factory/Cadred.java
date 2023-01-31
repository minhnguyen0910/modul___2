package home_work.factory;

public class Cadred {
    String name;
    int year;
    String sex;
    String address;

    @Override
    public String toString() {
        return "Cadred{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cadred(String name, int year, String sex, String address) {
        this.name = name;
        this.year = year;
        this.sex = sex;
        this.address = address;
    }
}
