package ss13_thuat_toan_tim_kiem.tim_chuoi_lien_tiep;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi cua ban");
        String string = scanner.nextLine();
        LinkedList<Character> characters = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            characters.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > characters.getLast() && !characters.contains(string.charAt(j))) {
                    characters.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (characters.size() > max.size()) {
                max.clear();
                max.addAll(characters);

            }
            characters.clear();
        }
        for (int i = 0; i < max.size(); i++) {
            System.out.print(max.get(i));
        }
    }

}
