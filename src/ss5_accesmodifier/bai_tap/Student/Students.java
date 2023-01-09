package ss5_accesmodifier.bai_tap.Student;

public class Students {
    private String name;
    private String classes;

    public Students() {
        this.name="John";
        this.classes="C02";

    }

    public Students(String name, String classes) {
        this.name = name;
        this.classes = classes;

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + getName() + '\'' +
                ", classes='" + getClasses() + '\'' +
                '}';
    }
}
