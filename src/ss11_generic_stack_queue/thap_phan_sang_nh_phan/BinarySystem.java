package ss11_generic_stack_queue.thap_phan_sang_nh_phan;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void Convert(int num){
        Stack<Integer> arr= new Stack<>();
        while (num != 0) {
            int a = num % 2;
              arr.push(a);
            num /= 2;
        }
        while (!arr.empty()){
            System.out.print(arr.pop());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Convert(number);
    }
}
