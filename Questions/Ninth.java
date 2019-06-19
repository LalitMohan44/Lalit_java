package Lalit.Lalit_java.Questions;

import java.util.Scanner;

public class Ninth {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scanner.nextInt();
        int pal = 0;
        int r;
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            pal = (pal*10)+r;
            n = n/10;
        }
        if(temp==pal)
            System.out.println(temp+" is a Palindrome number.");
        else
            System.out.println(temp+"is not a Palindrome number");
    }
}
