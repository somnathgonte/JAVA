//Check number is even or odd

import java.util.*;

public class Condition 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter number: ");
        Scanner Sobj = new Scanner(System.in);

        int iNo1 = Sobj.nextInt();

        if (iNo1%2 == 0)
         {
            System.out.println("Even number");
        }
         else 
        {
            System.out.println("Odd number");
        }
    }
}
