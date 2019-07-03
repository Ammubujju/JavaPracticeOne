package com.stackroute.pe1;

import java.util.Scanner;

public class AddIntegers{

    public static void main(String args[])
    {
        sum();
    }
    static void sum()
    {

        int sum=0;
        System.out.println("Enter the digits you want to add:");
        Scanner input=new Scanner(System.in);
        int no_of_times=input.nextInt();
        System.out.println("Enter the digits:");
        for(int i=0;i<no_of_times;i++)
        {

            int digit=input.nextInt();
            sum=sum+digit;
        }
        System.out.println("Sum of Integers:"+sum);
    }


}
