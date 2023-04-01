/* 
Recursion in java is a process in which a method calls itself continuously.
A method in java that calls itself is called recursive method. 
It makes the code compact but complex to understand.
*/

public class Recursion 
{
    public static void main(String []arg)
    {
        fun(3);   //method call from main method
    }

    public static void fun(int n)  //Called method
    {
        if(n>0)
        {
            System.out.println(n);
            fun(n-1);         //method call itself
        }
    }
    
}

/*
Output: 3
        2 
        1
 */

 