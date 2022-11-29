package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Account a=new Account("ACC12345","Nivedan",100);
        Account a1=new Account("ACC45673","Arjun");
        System.out.println("id:"+a.getId());
        System.out.println("name:"+a.getname());
        System.out.println("balance:"+a.getbalance());
        System.out.println("id2:"+a1.getId());
        System.out.println("name2:"+a1.getname());
//credit
        a.credit(100000);
//debit
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw : ");
        int Dr_amt = scan.nextInt();
        a.debit(Dr_amt);
//transfer
        a.transferto();
        a1.toString();
        System.out.println(a);
        System.out.println(a1);
    }
}