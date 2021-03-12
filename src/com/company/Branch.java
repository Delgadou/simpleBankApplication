package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, Double initialTransaction){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }

        return null;
    }

//    public boolean findCustomer(String customerName){
//        for(int i = 0; i < customers.size(); i++){
//            if(customers.get(i).getCostumerName().equals(customerName)){
//                return true;
//            }
//        }
//
//        return false;
//    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
