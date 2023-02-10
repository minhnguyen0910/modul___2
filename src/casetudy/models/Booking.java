package casetudy.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Booking {
    int bookingCode;
    LocalDate startDay;
    LocalDate finishDay;
    int customerCode;
    String serviceName;

    public Booking(int bookingCode, LocalDate startDay, LocalDate finishDay, int customerCode, String serviceName) {
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

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getFinishDay() {
        return finishDay;
    }

    public void setFinishDay(LocalDate finishDay) {
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
        return bookingCode+","+startDay+","+finishDay+","+customerCode+","+serviceName;
    }
}
