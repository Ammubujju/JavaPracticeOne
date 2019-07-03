package com.stackroute.pe1;

import java.util.Scanner;

public class VowelsConsonants
{

    public static void main(String[] args)
    {

        System. out. print( "Enter a string : ");
        Scanner scanner = new Scanner( System. in);
        String testString = scanner.nextLine();
        char[] stringToCharArray = testString.toCharArray();
        int count =0;

        for(char b : stringToCharArray)
        {
            int c =b;

            if((c>=97&&c<=122) || (c>=65&&c<=90))

                count++;

        }

        if(count==testString.length())
        {
            for (char ch : stringToCharArray)
            {

                if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')

                    System.out.print("Vowel ");
                else
                    System.out.print("Consonant ");

            }
        }
        else
        {
            System.out.println("Error");
        }

    }

}

