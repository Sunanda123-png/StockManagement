package com.bridgelabz;

import java.util.Scanner;

public class StockManagement {
    public static void sharedetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the share name:- ");
        String Name=sc.next();
        System.out.println("Enter the number of share:- ");
        int number=sc.nextInt();
        System.out.println("Enter the price of each share:- ");
        int price=sc.nextInt();
        System.out.println("Each share price is:- "+price);
        int result = 0;
        result=number*price;
        System.out.println("Total value of share is:- "+result);
    }

}
class ShareValue
{
    public static void main(String[] args)
    {
        StockManagement.sharedetails();
    }
}
