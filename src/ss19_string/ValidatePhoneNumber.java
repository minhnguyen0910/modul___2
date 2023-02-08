package ss19_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String PHONENUMBER = "^(\\(\\d{2})\\)-(\\(0\\d{9})\\)$";
    public static Pattern pattern;
    public static Matcher matcher;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien thoai can check: ");
        String phoneNumber = sc.nextLine();
        pattern = Pattern.compile(PHONENUMBER);
        matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());
    }
}
