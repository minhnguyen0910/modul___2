package home_work.hoc_sinh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manage manage=new Manage();
        Scanner s=new Scanner(System.in);
        int num;
        do {
            System.out.println("nhap lua chon cua ban\n" +
                    "1.Them\n" +
                    "2.Hien thi hoc sinh nam 1985\n" +
                    "3.Hien thi hoc sinh 1985 o Bac Ninh" +
                    "4.Thoat");
            num= Integer.parseInt(s.nextLine());
            switch (num){
                case 1:{
                    manage.add();
                    break;
                }
                case 2:{
                    manage.disPlay1985();
                    break;
                }
                case 3:{
                    manage.count();
                    break;
                }
            }
        }while (num<4);
    }
}
