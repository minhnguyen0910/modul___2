package ss2_vong_lap.bai_tap.bai_2;

public class PrimeNumberDisplay {

    public static boolean isPrime(int number) {
        boolean flag = true;
        if (number == 2 || number == 3) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    return flag;
                }
            }
            return flag;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while (count <= 20) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
