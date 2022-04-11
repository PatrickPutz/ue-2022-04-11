package org.campus02.transactions;

import java.io.Serializable;

public class Transaction implements Comparable<Transaction>, Serializable {

    private String transactionDate;
    private String product;
    private double price;
    private String paymentType;
    private String name;
    private String city;
    private String state;
    private String country;

    public Transaction(String transactionDate, String product, double price, String paymentType, String name, String city, String state, String country) {
        this.transactionDate = transactionDate;
        this.product = product;
        this.price = price;
        this.paymentType = paymentType;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionDate='" + transactionDate + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", paymentType='" + paymentType + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int compareTo(Transaction o) {
        return this.transactionDate.compareTo(o.transactionDate);
    }
}
