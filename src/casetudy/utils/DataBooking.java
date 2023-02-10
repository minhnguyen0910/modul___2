package casetudy.utils;

import casetudy.models.Booking;

import javax.imageio.IIOException;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataBooking {
    public List<Booking> readBooking() {
        List<Booking> bookingList = new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            FileReader fileReader = new FileReader("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\casetudy\\data\\file_of_booking.csv");
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
                bookingList.add(new Booking(bookingCode, startDay, finishDay, customerCode, serviceName));

            }

        } catch (IIOException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return bookingList;
    }
    public void writeBooking(List<Booking> bookingList){
        BufferedWriter bufferedWriter= null;
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\casetudy\\data\\file_of_bookingg.csv");
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
