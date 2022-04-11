package org.campus02.transactions;

import java.io.*;
import java.util.ArrayList;

public class TransactionObjectHandler {

    public static void saveTransactions(ArrayList<Transaction> list, String path) throws TransactionObjectException {

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(path)))){

            // oos.writeObject(list);

            int count = 0;
            for(Transaction obj : list){
                oos.writeObject(obj);
                count++;
                if(count % 100 == 0){
                    oos.flush();
                }
            }
            oos.writeObject(null);

            oos.flush();

        } catch (FileNotFoundException e) {
            throw new TransactionObjectException(e);
        } catch (IOException e) {
            throw new TransactionObjectException(e);
        }

    }

}
