package casetudy.models;

public class Booking {
    int bookingCode;
    int startDay;
    int finishDay;
    int customerCode;
    String serviceName;

    public Booking(int bookingCode, int startDay, int finishDay, int customerCode, String serviceName) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.finishDay = finishDay;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getFinishDay() {
        return finishDay;
    }

    public void setFinishDay(int finishDay) {
        this.finishDay = finishDay;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", startDay=" + startDay +
                ", finishDay=" + finishDay +
                ", customerCode=" + customerCode +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
