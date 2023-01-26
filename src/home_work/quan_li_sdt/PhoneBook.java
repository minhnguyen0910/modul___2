package home_work.quan_li_sdt;

import java.util.ArrayList;

public class PhoneBook extends Phone {
    static ArrayList<PhoneBook> PhoneList = new ArrayList<>();

    public PhoneBook(String name, String phone) {
        super(name, phone);
    }

    public static void insertPhone(String name, String phone) {
        PhoneBook phones = new PhoneBook(name, phone);
        if (PhoneList.size() == 0) {
            PhoneList.add(phones);
        } else {
            for (int i = 0; i < PhoneList.size(); i++) {
                if (name.equals(PhoneList.get(i).getName())) {
                    if (!phone.equals(PhoneList.get(i).getPhone())) {
                        PhoneList.get(i).setPhone(PhoneList.get(i).getPhone() + ":" + phone);
                    }
                } else {
                    PhoneList.add(phones);
                }
            }
        }
    }

    @Override
    void removePhone(String name) {
      for (int i=0; i<PhoneList.size();i++){
          if (name.equals(PhoneList.get(i).getName())){
              PhoneList.remove(PhoneList.get(i));
          }
      }
    }

    @Override
    void updatePhone(String name, String newphone) {
        for (int i=0; i<PhoneList.size();i++){
            if (name.equals(PhoneList.get(i).getName())){
                PhoneList.get(i).setPhone(newphone);
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (int i=0; i<PhoneList.size();i++){
            if (name.equals(PhoneList.get(i).getName())){
                PhoneList.get(i).getPhone();
            }
        }
    }

    @Override
    void sort() {

    }

}
