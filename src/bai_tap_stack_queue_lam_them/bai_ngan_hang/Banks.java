package bai_tap_stack_queue_lam_them.bai_ngan_hang;

public class Banks implements Comparable<Banks> {
    int id;
    int priority;

    public Banks(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Banks{" +
                "id=" + id +
                ", priority=" + priority +
                '}';
    }


    @Override
    public int compareTo(Banks o) {
        return o.getPriority()-this.priority;
    }
}
