//Take input from user and find summation.

//Input: 100
//Output: 5050

import java.util.Scanner;
public class Sum 
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = sc.nextInt();

        int sum = 0;

        for(int Count = 1 ; Count <= num ; Count++)
        {
            sum = sum + Count;
        }
        System.out.println(sum);
    }
    
}
