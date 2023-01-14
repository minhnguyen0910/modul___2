package ss11_generic_stack_queue.revese;

import java.util.Scanner;
import java.util.Stack;

public class StrStack {
    public static void main(String[] args) {
        Stack<String> array = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String string = scanner.nextLine();
            array.push(string);
        }
        System.out.println("Before Array:  " + array);
        Stack<String> arrayReverse = new Stack<>();
        while (!array.empty()) {
            arrayReverse.push(array.pop());
        }
        for (String index : arrayReverse) {
            array.push(index);
        }
        System.out.println("After Array: " + array);
    }
}
