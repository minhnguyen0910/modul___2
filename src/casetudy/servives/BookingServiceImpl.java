package casetudy.servives;

import casetudy.controller.FuramaController;
import casetudy.models.*;
import casetudy.servives.interfacee.IBookingService;
import casetudy.utils.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static Map<Villa,Integer> villaIntegerMap=new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);
    DataCustomer dataCustomer = new DataCustomer();
    DataRoom dataRoom = new DataRoom();
    static DataVilla dataVilla = new DataVilla();
    DataBooking dataBooking = new DataBooking();
    Regex regex = new Regex();
    FuramaController furamaController = new FuramaController();
    Set<Booking> bookingSet=new TreeSet<>();

    public void addBooking() throws IOException {
        Map<Villa, Integer> villaIntegerMap1 = dataVilla.Read();
        Map<Room, Integer> roomIntegerMap = dataRoom.Read();

        System.out.println("moi ban nhap ma khach hang co trong list");
        try {
            for (Customer i : dataCustomer.Read()) {
                System.out.println(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int codeCustomer = 0;
        boolean flagOfCustomerCode = false;
        do {
            boolean flag;
            do {
                try {
                    flag = true;
                    codeCustomer = Integer.parseInt(scanner.nextLine());
                    flagOfCustomerCode = false;
                } catch (NumberFormatException e) {
                    flag = false;
                    System.out.println("vui long nhap code bang so");
                }
            } while (!flag);

            for (Customer i : dataCustomer.Read()) {
                if (i.getCustomerCode() == codeCustomer) {
                    flagOfCustomerCode = true;
                }
            }
        } while (!flagOfCustomerCode);
        System.out.println("moi ban nhap ma dich vu co trong list");
        try {
            System.out.println("Room: ");
            for (Room i : dataRoom.Read().keySet()) {
                System.out.println(i);
            }
            System.out.println("Villa: ");
            for (Villa i : dataVilla.Read().keySet()) {
                System.out.println(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String codeService;
        boolean flagOfCodeService = false;
        String serviceName = null;
        int count = 0;
        Room room = null;
        Villa villa = null;
        do {
            do {
                System.out.println("nhap ma theo dinh dang SVVL-YYYY hoac SVRO-YYYY");
                codeService = scanner.nextLine();
                flagOfCodeService = false;
            } while (!regex.checkCodeVillaServiceRegex(codeService) && !regex.checkCodeRoomServiceRegex(codeService));
            for (Room i : roomIntegerMap.keySet()) {
                if (i.getRoomCode().equals(codeService)) {
                    count = roomIntegerMap.get(i);
                    room = i;
                    flagOfCodeService = true;
                    serviceName = i.getServiceName();
                    if (roomIntegerMap.get(i) >= 5) {
                        System.out.println("phong can duoc bao tri");
                    }
                    break;
                }
            }
            if (!flagOfCodeService) {
                for (Villa i : villaIntegerMap1.keySet()) {
                    if (i.getVillaCode().equals(codeService)) {
                        count = villaIntegerMap1.get(i);
                        villa = i;
                        serviceName = i.getServiceName();
                        flagOfCodeService = true;
                        if (villaIntegerMap1.get(i) >= 5) {
                            System.out.println("villa can duoc bao tri");
                        }
                        break;
                    }
                }
            }

        } while (!flagOfCodeService);
        System.out.println("moi ban nhap ma booking");
        int bookingCode = 0;
        boolean flagOfBookingCode = true;
        do {
            flagOfBookingCode = true;
            boolean flag;
            do {
                try {
                    bookingCode = Integer.parseInt(scanner.nextLine());
                    flag = true;
                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap bang so");
                    flag = false;
                }

            } while (!flag);
            for (Booking i : dataBooking.readBooking()) {
                if (i.getBookingCode() == bookingCode) {
                    System.out.println("ma da ton tai");
                    flagOfBookingCode = false;
                    break;
                }
            }

        } while (!flagOfBookingCode);
        System.out.println("moi ban nhap ngay bat dau");
        LocalDate startDay = null;
        String startDays = null;
        boolean flagOfStartDay = true;
        do {
            try {
                startDays = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                startDay = LocalDate.parse(startDays, formatter);
                flagOfStartDay = true;
            } catch (DateTimeParseException e) {
                System.out.println("vui long nhap theo dd/MM/yyyy");
                flagOfStartDay = false;
            }


        } while (!flagOfStartDay);
        System.out.println("moi ban nhap ngay ket thuc");
        LocalDate finishDay = null;
        String finishDays;
        boolean flagOfFinishDay = true;
        do {
            try {
                finishDays = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                finishDay = LocalDate.parse(finishDays, formatter);
                flagOfFinishDay = true;
            } catch (DateTimeParseException e) {
                System.out.println("vui long nhap theo dd/MM/yyyy");
                flagOfFinishDay = false;
            }


        } while (!flagOfFinishDay);
        String choosess;
        do {
            System.out.println("xac nhan\n" +
                    "1.ok\n" +
                    "2.ko");
            choosess = scanner.nextLine();
            switch (choosess) {
                case "1":
                    Booking booking = new Booking(bookingCode, startDay, finishDay, codeCustomer, serviceName);
                    FileWriter fileWriter = new FileWriter(HangSo.FILE_BOOKING, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(booking + "\n");
                    bufferedWriter.close();
                    bookingSet.add(booking);

                    if (villa != null) {
                        count++;
                        villaIntegerMap1.replace(villa,count);
                        dataVilla.write(villaIntegerMap1);

                    } else if (room!=null){
                        count++;
                        roomIntegerMap.put(room, count);
                        dataRoom.write(roomIntegerMap);

                    }
                    break;
                case "2":
                    furamaController.displayMainMenu();
            }
        } while (!"12".contains(choosess));


    }

    public void displayBooking() {
        Set<Booking> bookingList = dataBooking.readBooking();
        for (Booking i : bookingList) {
            System.out.println(i);
        }
    }
    public void resetTheNumberOfUses() throws IOException {
        Map<Room,Integer> data=dataRoom.Read();
        Map<Villa,Integer> dat=dataVilla.Read();
        for (Room i:data.keySet()){
            data.replace(i,0);
        }
        dataRoom.write(data);
        for (Villa i:dat.keySet()){
            dat.replace(i,0);
        }
        dataVilla.write(dat);
    }

    public static void main(String[] args) throws IOException {
        BookingServiceImpl b = new BookingServiceImpl();
       b.addBooking();
//        b.resetTheNumberOfUses();
    }
}
