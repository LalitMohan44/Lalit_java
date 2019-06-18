package Lalit.Lalit_java;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= scanner.nextLine();

        System.out.println("Enter your Year of Birth:");
        int y= scanner.nextInt();
        int age=2019-y;

        System.out.println("Your name is "+name+" and you are "+age+" years old");
        scanner.close();
    }
}
