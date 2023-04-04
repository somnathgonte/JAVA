//Comparision of two numbers

import java.util.*; //package for input 

public class Condition1          //class name
{
    public static void main(String[] args)   //main method
    {
        System.out.print("Enter First number:");  
        Scanner Sobj = new Scanner(System.in);      //for taking input from user  
        
        int iNo1 = Sobj.nextInt();                 //taking first value from user

        System.out.print("Enter Second number");
        int iNo2 = Sobj.nextInt();                //taking second value from user

        if (iNo1 == iNo2)
        {
            System.out.println(iNo1+" equal to "+iNo2);
        }  
        else if (iNo1 > iNo2) 
        {
            System.out.println(iNo1+" is greter than "+iNo2);
        } 
        else 
        {
            System.out.println(iNo1+" is less than "+iNo2);
        }

    }

}
