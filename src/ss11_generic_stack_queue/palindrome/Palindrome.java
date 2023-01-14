package ss11_generic_stack_queue.palindrome;

import java.util.*;

public class Palindrome {
    static boolean solution(String string) {
        String[] array = string.toLowerCase().split("");
        Queue<String> stringQueue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            stringQueue.add(array[i]);
        }
        while (!stack.empty()) {
            if (!stack.pop().equals(stringQueue.poll())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(solution(string));
    }
}

