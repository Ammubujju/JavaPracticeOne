package com.stackroute.pe1;

import java.util.Scanner;

public class LastCharactersRepeat
{
    public static void main(String[] args)
    {
        String str;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        str = input.nextLine();
        System.out.print("Enter a number:");
        n = input.nextInt();
        LastCharactersRepeat obj = new LastCharactersRepeat();
        obj.characterrepeat(str, n);
    }

    public void characterrepeat(String str, int n)
    {
        int i;

        String str1 = str.substring(str.length() - n);

        for (i = 0; i < n; i++)

            str += str1;

        System.out.println(str);

    }
}


