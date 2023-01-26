package home_work.quan_li_sdt;

public abstract class Phone {
    private String name;
    private String phone;

    public Phone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    static void insertPhone(String name, String phone) {
    }

    abstract void removePhone(String name);

    abstract void updatePhone(String name, String newphone);

    abstract void searchPhone(String name);

    abstract void sort();
}
