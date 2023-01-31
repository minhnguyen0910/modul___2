package ss11_generic_stack_queue.abc;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String string = scanner.nextLine();
        String[] arr = string.toLowerCase().split("");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(map.containsKey(arr[i]))) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);
    }
}
