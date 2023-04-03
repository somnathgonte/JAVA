//Mathematical operation of two numbers

import java.util.*;

public class Calculator 
{

    public static void main(String[] args) 
    {

        Scanner Sobj = new Scanner(System.in);
        System.out.print("Enter First number:");
        int iNo1 = Sobj.nextInt();

        System.out.print("Enter second number:");
        int iNo2 = Sobj.nextInt();

        int Add = iNo1 + iNo2;
        System.out.println(Add);

        int Sub = iNo1 - iNo2;
        System.out.println(Sub);

        int Multi = iNo1 * iNo2;
        System.out.println(Multi);

        int Divi = iNo1 / iNo2;
        System.out.println(Divi);

        int Mod = iNo1 % iNo2;
        System.out.println(Mod);

    }

}
