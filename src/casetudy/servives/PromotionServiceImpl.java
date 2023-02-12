package casetudy.servives;

import casetudy.models.Booking;
import casetudy.models.Customer;
import casetudy.models.Room;
import casetudy.models.Villa;
import casetudy.servives.interfacee.IPromotionServiceImpl;
import casetudy.utils.DataBooking;
import casetudy.utils.DataCustomer;
import casetudy.utils.DataRoom;
import casetudy.utils.DataVilla;
import com.sun.source.tree.Tree;

import java.io.IOException;
import java.util.*;

public class PromotionServiceImpl implements IPromotionServiceImpl {
    DataCustomer dataCustomer = new DataCustomer();
    DataBooking dataBooking = new DataBooking();
    DataVilla dataVilla = new DataVilla();
    DataRoom dataRoom = new DataRoom();
    Scanner scanner = new Scanner(System.in);

    public void showCustomers() throws IOException {
        List<Booking> bookingList = dataBooking.readBooking();
        Set<Integer> setOfCustomerCode = new TreeSet<>();
        List<Customer> customerList = dataCustomer.Read();
        List<Integer> listOfCustomerCode = new ArrayList<>();
        System.out.println("moi ban nhap nam tim kiem");
        int year = 0;
        boolean flagCheckYear1 = true;
        do {
            boolean flagCheckYear;
            do {
                boolean flag;
                try {
                    year = Integer.parseInt(scanner.nextLine());
                    flagCheckYear = true;
                } catch (NumberFormatException e) {
                    flagCheckYear = false;
                    System.out.println("vui long nhap bang so");
                }
            } while (!flagCheckYear);
            for (Booking i : bookingList) {
                if (year == i.getStartDay().getYear()) {
                    for (Room y : dataRoom.Read().keySet()) {
                        if (y.getRentalType().equals("thue theo nam") && y.getRoomCode().equals(i.getServiceCode())) {
                            setOfCustomerCode.add(i.getCustomerCode());
                        }
                    }
                }
            }
            listOfCustomerCode.addAll(setOfCustomerCode);
            for (int i = 0; i < listOfCustomerCode.size(); i++) {
                for (int j = 0; j < customerList.size(); j++) {
                    if (listOfCustomerCode.get(i) == customerList.get(j).getCustomerCode()) {
                        System.out.println(customerList.get(j));
                        break;
                    }
                }
            }
        } while (!flagCheckYear1);


    }
    public void checkPromotion(){
        List<Booking> listVoucher10=new ArrayList<>();
        List<Booking> listVoucher20=new ArrayList<>();
        List<Booking> listVoucher50=new ArrayList<>();
        Stack<Booking>bookingOfMonth=new Stack<>();
        System.out.println("nhap thang hien tai");
        int month = 0;
        boolean flagOfMonth;
        do {
            try {
                month=Integer.parseInt(scanner.nextLine());
                flagOfMonth=true;
            }catch (NumberFormatException e){
                System.out.println("vui long nhap bang so");
                flagOfMonth=false;
            }
        }while (!flagOfMonth);
        System.out.println("nhap nam hien tai");
        int year = 0;
        boolean flagOfYear;
        do {
            try {
                year=Integer.parseInt(scanner.nextLine());
                flagOfYear=true;
            }catch (NumberFormatException e){
                System.out.println("vui long nhap bang so");
                flagOfYear=false;
            }
        }while (!flagOfYear);
        System.out.println("so luong voucher 10% :");
        int voucher10 = 0;
        boolean flagOfVoucher10;
        do {
            try {
                voucher10=Integer.parseInt(scanner.nextLine());
                flagOfVoucher10=true;
            }catch (NumberFormatException e){
                System.out.println("vui long nhap bang so");
                flagOfVoucher10=false;
            }
        }while (!flagOfVoucher10);
        System.out.println("so luong voucher 20");
        int voucher20 = 0;
        boolean flagOfVoucher20;
        do {
            try {
                voucher20=Integer.parseInt(scanner.nextLine());
                flagOfVoucher20=true;
            }catch (NumberFormatException e){
                System.out.println("vui long nhap bang so");
                flagOfVoucher20=false;
            }
        }while (!flagOfVoucher20);
        System.out.println("so luong voucher 50");
        int voucher50;
        boolean flagOfVoucher50;
        do {
            try {
                voucher50=Integer.parseInt(scanner.nextLine());
                flagOfVoucher50=true;
            }catch (NumberFormatException e){
                System.out.println("vui long nhap bang so");
                flagOfVoucher50=false;
            }
        }while (!flagOfVoucher50);
        for (Booking i:dataBooking.readBooking()){
            if (month==i.getStartDay().getMonthValue()&&year==i.getStartDay().getYear()){
                bookingOfMonth.add(i);
            }
        }
        while (!bookingOfMonth.empty()){
            if (listVoucher10.size()<voucher10){
                listVoucher10.add(bookingOfMonth.pop());
            }else if(listVoucher20.size()<voucher20){
                listVoucher20.add(bookingOfMonth.pop());
            }else {
                listVoucher50.add(bookingOfMonth.pop());
            }
        }
        System.out.println("danh sach khach hang nhan duoc voucher 10% :");
        System.out.println(listVoucher10);
        System.out.println("danh sach khach hang nhan duoc voucher 20% :");
        System.out.println(listVoucher20);
        System.out.println("danh sach khach hang nhan duoc voucher 50% :");
        System.out.println(listVoucher50);

    }

    public static void main(String[] args) throws IOException {
        PromotionServiceImpl a = new PromotionServiceImpl();
        a.checkPromotion();
    }
}
