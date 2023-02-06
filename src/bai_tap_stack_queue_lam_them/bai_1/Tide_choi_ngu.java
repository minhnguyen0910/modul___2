package bai_tap_stack_queue_lam_them.bai_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tide_choi_ngu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap lua chon cua ban");
        int num = Integer.parseInt(scanner.nextLine());
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);

        for (int i = 1; i < num; i++) {
            integerQueue.add(integerQueue.peek());
            integerQueue.add(integerQueue.peek());
            integerQueue.poll();
        }
        System.out.println(integerQueue.element());
    }
}
