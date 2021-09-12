/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println( "Enter a number:" );
        num1 = scan.nextInt();
        System.out.println( "Enter a number:" );
        num2 = scan.nextInt();
        System.out.println( "Enter a number:" );
        num3 = scan.nextInt();

        if( num1 == num2 )
        {
            System.out.println("Error, repeating number.");
            System.exit(0);
        }
        if( num1 == num3 )
        {
            System.out.println("Error, repeating number.");
            System.exit(0);
        }
        if( num2 == num3 )
        {
            System.out.println("Error, repeating number.");
            System.exit(0);
        }

        if( num1 > num2 && num1 > num3 )
        {
            System.out.println("The largest number is " + num1 + "." );
        }

        if( num2 > num1 && num2 > num3 )
        {
            System.out.println("The largest number is " + num2 + "." );
        }

        if( num3 > num1 && num3 > num2 )
        {
            System.out.println("The largest number is " + num3 + "." );
        }
    }
}
