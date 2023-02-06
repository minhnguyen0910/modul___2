package bai_tap_stack_queue_lam_them.bai_ngan_hang;

import java.util.*;

public class Manage {
    Scanner scanner= new Scanner(System.in);
    static Queue<Banks> myBanks=new LinkedList<>();

    public void add(){
        System.out.println("nhap ma so");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap do uu tien");
        int priority=Integer.parseInt(scanner.nextLine());
        Banks banks=new Banks(id,priority);
        myBanks.add(banks);
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        myBanks.add(new Banks(1,2));
        myBanks.add(new Banks(2,1));
        int num= Integer.parseInt(scanner.nextLine());
        myBanks.size();

//        Manage manage=new Manage();
//
//        switch (num){
//            case 0:
//                System.exit(1);
//                break;
//            case 1:
//                manage.add();
//                break;
//            case 2:
//
//        }
    }
}
