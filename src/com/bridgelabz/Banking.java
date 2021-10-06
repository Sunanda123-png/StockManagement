package com.bridgelabz;

import java.util.Scanner;

public class Banking
{
    Scanner scanner;
    public Banking()
    {
        scanner =new Scanner(System.in);
    }
    public int getInt()
    {
        return scanner.nextInt();
    }
    public String getString()
    {
        return scanner.nextLine();
    }

    /**
     * for adding the money in your account
     * @param amount
     * @return
     */
    public int credit(int amount)
    {
        System.out.println("Enter the Credit amount:-");
        int creditamount=getInt();
        amount=amount+creditamount;
        return  amount;
    }

    /**
     * for collecting the money from your account
     * @param amount
     * @return
     */
    public int debit(int amount) {
        System.out.println("Enter the Debit amount:-");
        int debitamount=getInt();
        if (debitamount<=amount)
            amount=amount-debitamount;
        else
            System.out.println("Debit amount exceeded account balance");
        return amount;
    }

    /**
     * For chossing the options this method has been created
     * @param name
     * @param account_No
     * @param amount
     * @return
     */
    public int creditOrDebit(String name, int account_No, int amount) {
        System.out.println("Enter your Choice:- 1.Credit 2.Debit ");
        int Choice = getInt();
        if (Choice == 1)
        {
            amount = credit(amount);
        } else if (Choice == 2)
        {
            amount = debit(amount);
        }
        return amount;
    }
    public void printDetails(String name, int accountnumber, int amount)
    {
        System.out.println("Account Holder Name:-"+name+"Account number:-"+accountnumber);
        System.out.println("Your Bal is:-" + amount);
    }
}
class Main
{
    /**
     * Executing all method from main
     * @param args
     */
    public static void main(String[] args)
    {
        int accountnumber;
        String name;
        int amount;

        Banking audit=new Banking();
        System.out.println("Enter Name:- ");
        name= audit.getString();
        System.out.println("Enter Account Number:- ");
        accountnumber = audit.getInt();
        System.out.println("Enter the Credit amount:- ");
        amount = audit.getInt();
        while (true)
        {
            int BasicAmount=audit.creditOrDebit(name,accountnumber,amount);
            System.out.println("Enter your Choice : 1.Repeat 2.Print details");
            int option= audit.getInt();
            if (option==2)
            {
                audit.printDetails(name,accountnumber,BasicAmount);
            }
        }
    }
}
