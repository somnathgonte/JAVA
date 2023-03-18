//Program to print 5 to 1 number on screen
//Program to print 5 times marvellous on screen
//program to divide two numbers
//Program to print * on the screen

import java.util.*;
public class Assignment3 
{
    public static void divide(int num1,int num2)
    {
        int division = num1/num2;
        System.out.println(division);
    }
    public static void printNumber()
    {
        for(int i=5;i>=1;i--)
        {
            System.out.println(i);

        }
    }
    public static void printName()
    {
        for(int i =1;i<=5;i++)
        {
            System.out.println("Marvellous");

        }
    }
    public static void divisible(int num1)
    {
        if(num1%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else 
        {
            System.out.println("Not divisible by 5");
        }

    }
    public static void print(int num)
    {
        for(int i=1;i<=num;i++)
        {
            System.out.print("*  ");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int iNo1 = sc.nextInt();
        int iNo2 = sc.nextInt();
        
        printName();
        printNumber();
        divide(iNo1,iNo2);
        divisible(iNo1);
        print(iNo1);
    }
}
