package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String costumerName, double initialTransaction) {
        this.name = costumerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(double transactionValue){
        this.transactions.add(transactionValue);
    }

    public void showTransactions(){
        for(int i = 0; i < transactions.size(); i++){
            System.out.println((i+1) + ". " + transactions.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
