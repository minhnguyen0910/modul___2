package ss11_generic_stack_queue.revese;

import java.util.Scanner;
import java.util.Stack;

public class IntStack {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            array.push(num);
        }
        System.out.println("Before Array:  " + array);
        Stack<Integer> arrayReverse = new Stack<>();
        while (!array.empty()) {
            arrayReverse.push(array.pop());
        }
        for (int index : arrayReverse) {
            array.push(index);
        }
        System.out.println("After Array: " + array);
    }
}
