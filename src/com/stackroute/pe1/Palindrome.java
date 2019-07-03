package  com.stackroute.pe1;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        int r, sum1 = 0, sum = 0, n = 0, temp;
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = n1;
        temp = n1;
        while (n1 > 0)
        {
            r = n1 % 10;
            sum1 = (sum1 * 10) + r;
            n1 = n1 / 10;
        }
        if (temp == sum1)
        {

            System.out.println(n2 + "is palindrome");
            while (temp > 0) {
                n = temp % 10;
                if (n % 2 == 0)
                    sum = sum + n;
                temp = temp / 10;
            }
            System.out.println((sum > 25) ? "and the sum of even numbers is greater than 25" : "and the sum of even numbers is less than 25");
        }
        else
            System.out.println(n2 + "is not palindrome");
    }
}




