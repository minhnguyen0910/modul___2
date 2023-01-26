package home_work.quan_li_sdt;

import static home_work.quan_li_sdt.PhoneBook.PhoneList;

public class ManagePhoneBook {
    public static void main(String[] args) {
        PhoneBook.insertPhone("abc", "123");
        PhoneBook.insertPhone("abc","1123");
        System.out.println(PhoneList.get(0).getPhone());
    }
}
