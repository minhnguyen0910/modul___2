package home_work.factory;

public class Staff extends Cadred {
    String job;

    public Staff(String name, int year, String sex, String address, String job) {
        super(name, year, sex, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "job='" + job + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
