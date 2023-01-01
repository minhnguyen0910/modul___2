package ss2_vong_lap.bai_tap.bai_3;

public class Display {
    public static boolean check(int num){
        boolean flag=true;
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                flag= false;
                return flag;
            }
        }return flag;
    }

    public static void main(String[] args) {
        for (int i=2;i<100;i++){
            if (check(i)){
                System.out.print(i+" ");
            }
        }
    }
}
