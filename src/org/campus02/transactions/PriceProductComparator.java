package org.campus02.transactions;

import java.util.Comparator;

public class PriceProductComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {

        int result = Double.compare(o2.getPrice(), o1.getPrice());

        if(result == 0){
            return o1.getProduct().compareTo(o2.getProduct());
        }

        return result;
    }
}
