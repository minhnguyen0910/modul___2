package home_work.factory;

public class Engineer extends Cadred {
    String trainingIndustry;

    public Engineer(String name, int year, String sex, String address, String trainingIndustry) {
        super(name, year, sex, address);
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "trainingIndustry='" + trainingIndustry + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
}
