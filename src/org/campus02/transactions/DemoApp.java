package org.campus02.transactions;

import java.util.ArrayList;
import java.util.Collections;

public class DemoApp {

    public static void main(String[] args) throws TransactionLoadException, TransactionObjectException {

        ArrayList<Transaction> list = TransactionLoader.loadTransactions("C:\\Studium\\temp\\transactions.csv");

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

        /*
        Collections.sort(list);
        System.out.println(list);
         */

        Collections.sort(list, new PriceProductComparator());
        System.out.println(list);

        TransactionObjectHandler.saveTransactions(list, "C:\\Studium\\temp\\transactions-objects.dat");
        
        TransactionManager tm = new TransactionManager(list);

        System.out.println("tm.getTransactionCountByCity() = " + tm.getTransactionCountByCity());

        System.out.println("tm.getAverageTransactionAmountByPaymentType() = " + tm.getAverageTransactionAmountByPaymentType());
    }

}
