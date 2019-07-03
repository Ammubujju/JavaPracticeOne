package com.stackroute.pe1;

import java.util.*;

public class NumberGuess
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();   // Reading integer value

        if(number>=1 && number<=50)
        {
            System.out.println("Number guessed matches the original number");
        }
        else if(number<1)
        {
            System.out.println("Number guessed is less than original number");
        }
        else
        {
            System.out.println("Number guessed is more than original number");
        }

    }

}
