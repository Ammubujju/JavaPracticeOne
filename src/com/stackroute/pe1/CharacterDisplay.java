package com.stackroute.pe1;

import java.util.Scanner;

public class CharacterDisplay {

    public static void main(String[] args)
    {

        CharacterDisplay Check= new CharacterDisplay();
        Check.CheckCharacter();
    }
    public void CheckCharacter(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any character:");
        char character = s.next().charAt(0);
        if(character >= 97 && character <= 123)
        {
            System.out.println("Small letter");
        }
        else if(character >= 65 && character <= 96)
        {
            System.out.println("Capital letter");
        }
        else if(character >= 48 && character <= 57)
        {
            System.out.println("Digit");
        }
        else if(character >= 33 && character <= 47)
        {
            System.out.println("Special character");
        }
    }
}
