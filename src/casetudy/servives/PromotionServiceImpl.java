package casetudy.servives;

import casetudy.models.Booking;
import casetudy.servives.interfacee.IPromotionServiceImpl;
import casetudy.utils.DataBooking;
import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.Set;

public class PromotionServiceImpl implements IPromotionServiceImpl {
    DataBooking dataBooking=new DataBooking();
    Scanner scanner= new Scanner(System.in);
    public void showCustomers(){
        Set<Booking> bookingSet=dataBooking.readBooking();
        System.out.println("moi ban nhap nam tim kiem");
        int year = 0;
        boolean flagCheckYear1=true;
        do {
            boolean flagCheckYear;
            do {
                boolean flag;
                try {
                    year=Integer.parseInt(scanner.nextLine());
                    flagCheckYear=true;
                }catch (NumberFormatException e){
                    flagCheckYear=false;
                    System.out.println("vui long nhap bang so");
                }
            }while (!flagCheckYear);
            for (Booking i:bookingSet){
                if (year==5){
                    
                }
            }
        }while (!flagCheckYear1);


    }
}
