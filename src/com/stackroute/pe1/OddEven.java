package com.stackroute.pe1;

import java.util.Scanner;

public class OddEven
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number between 20 and 30:");
        int n = scan.nextInt();
        if (n > 20 && n < 30)
        {
            if (n % 2 == 0)

                System.out.println("Jerry");

            else

                System.out.println("Tom");
        }

        else

            System.out.println("not in range");


    }
}