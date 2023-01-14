package ss11_generic_stack_queue.dau_ngoac;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void bracket(String char1) {
        String[] arr = char1.split("");
        Stack<String> bStack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                bStack.push("(");
            } else if (arr[i].equals(")")) {
                if (bStack.empty()) {
                    flag = false;
                    break;
                } else {
                    bStack.pop();
                }
            }
        }
        if (flag && bStack.empty()) {
            System.out.println(" Well ");
        } else {
            System.out.println(" No Well ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input char :");
        String char1 = scanner.nextLine();
        bracket(char1);
    }
}

