package ss19_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateClassName {

        public static final String NAME_REGEX = "^[CAP]{1}\\d{4}[G-M]{1}$";
        public static Pattern pattern;
        public static Matcher matcher;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten lop can check: ");
            String className = sc.nextLine();
            pattern = Pattern.compile(NAME_REGEX);
            matcher = pattern.matcher(className);
            System.out.println(matcher.matches());
        }
    }