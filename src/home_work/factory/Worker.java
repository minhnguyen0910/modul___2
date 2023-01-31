package home_work.factory;

public class Worker extends Cadred{
    String typeOfWorker;

    public Worker(String name, int year, String sex, String address, String typeOfWorker) {
        super(name, year, sex, address);
        this.typeOfWorker = typeOfWorker;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "typeOfWorker='" + typeOfWorker + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getTypeOfWorker() {
        return typeOfWorker;
    }

    public void setTypeOfWorker(String typeOfWorker) {
        this.typeOfWorker = typeOfWorker;
    }
}
