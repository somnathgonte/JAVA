public class Recursion2 
{
    public static void main(String []arg)
    {
        fun(3);   //method call from main method
    }

    public static void fun(int n)  //Called method
    {
        if(n>0)
        {
            fun(n-1);         //method call itself

            System.out.println(n);
        }
    } 
}


/*
Output : 1
         2
         3
 */