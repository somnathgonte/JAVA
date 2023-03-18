//Program to divide two numbers.

import java.util.*;
public class Assignment1
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int iNo1 = sc.nextInt();
        int iNo2 = sc.nextInt();
        divide(iNo1,iNo2);
    }

    public static void divide(int n1,int n2)
    {
        int division = n1/n2;
        System.out.println(division);

    }
}