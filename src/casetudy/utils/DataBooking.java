package casetudy.utils;

import casetudy.models.Booking;

import javax.imageio.IIOException;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DataBooking {
    public Set<Booking> readBooking() {
        Set<Booking> bookingSet=new TreeSet<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(HangSo.FILE_BOOKING);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int bookingCode = Integer.parseInt(temp[0]);
                LocalDate startDay = LocalDate.parse(temp[1]);
                LocalDate finishDay = LocalDate.parse(temp[2]);
                int customerCode = Integer.parseInt(temp[3]);
                String serviceName = temp[4];
                bookingSet.add(new Booking(bookingCode, startDay, finishDay, customerCode, serviceName));

            }
            bufferedReader.close();
        } catch (IOException e) {

        }
        return bookingSet;
    }
    public void writeBooking(List<Booking> bookingList){
        BufferedWriter bufferedWriter= null;
        try {
            FileWriter fileWriter = new FileWriter(HangSo.FILE_BOOKING);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking i : bookingList) {
                bufferedWriter.write(i + ",");
            }
        }catch (IOException e){
            throw new RuntimeException();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
