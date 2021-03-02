package bai12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class CompareByPriceReduce implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o2.getPrice() > o1.getPrice()){
            return 1;
        }else {
            if (o2.getPrice()<o1.getPrice()){
                return -1;
            }else {
                return 0;
            }
        }
    }
}
