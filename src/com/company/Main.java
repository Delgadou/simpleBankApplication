package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Banco do Brasil");

        bank.addBranch("Hipica");
        bank.addCustomer("Hipica", "Henrique", 100.499);
        bank.addCustomer("Hipica", "Selita", 50.22);

        bank.addBranch("Independencia");
        bank.addCustomer("Independencia", "Guilherme", 20.42);
        bank.addCustomer("Independencia", "Pamela", 40.59);

        bank.addBranch("Vila Nova");
        bank.addCustomer("Vila Nova", "José", 25.02);
        bank.addCustomer("Vila Nova", "Ivan", 60.20);

        bank.addCustomerTransaction("Hipica", "Henrique", 200.53);
        bank.addCustomerTransaction("Hipica", "Henrique", 239.53);
        bank.listCustomers("Hipica", true);
        bank.listCustomers("Vila Nova", true);

        if(!bank.addCustomer("Cidade Baixa", "Henrique", 200.02)){
            System.out.println("Cidade Baixa branch does not exists");
        }

        if(!bank.addCustomerTransaction("Hipica", "Leonardo", 20.12)){
            System.out.println("Customer does not exist at branch");
        }

    }
}
