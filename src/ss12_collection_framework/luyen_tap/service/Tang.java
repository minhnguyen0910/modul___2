package ss12_collection_framework.luyen_tap.service;

import java.util.Comparator;

public class Tang implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
