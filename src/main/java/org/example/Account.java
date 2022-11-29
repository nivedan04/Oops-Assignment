package org.example;

import java.util.Scanner;

public class Account {
    String id;
    String name;
    int balance = 0;
    int amount;
    int withdrawamount;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public int getbalance() {
        return balance;
    }

    public int credit(int amount) {
//        balance = balance + amount;
        balance += amount;
        System.out.println("credit amount:" + amount);
        System.out.println("Current Balence : " + balance);
        //System.out.println(amount);
        return balance;
    }

    public int debit(int withdrawamount) {
        if (amount <= balance) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("debit amount");
//            System.out.println("Enter withdraw Amount:");
//            withdrawamount = scan.nextInt();
            balance = balance - withdrawamount;
            System.out.println("Remaining Amount:" + balance);
        } else {
            System.out.println("Amount exceed balance");
        }
        return amount;
    }

    public int transferto() {
        if (amount <= balance) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Transfer To Another Account:");
            System.out.println("Enter account number:");
            int accountno = scan.nextInt();
            System.out.println("How much Amount you want to Transfer:");
            int aaa = scan.nextInt();
            int anotheraccount;
            if (accountno == 1234) {
                anotheraccount = amount + aaa;
                System.out.println("Amt transferred to Another Account:" + anotheraccount);
                System.out.println("Transaction successfull");
            } else {
                System.out.println("Invalid AccountNumber");
            }
        } else {
            System.out.println("amount exceed balance");
        }
        return 0;
    }

    public String toString() {
        return "Account[id=" + id + " name=" + name + " balance=" + balance + "]";
    }

}
