/*Method overloading-->
         1.Having more than one method with 
           same name inside the same class.
        2.Method can hava same method name 
        but formal argument should be different.
*/

public class Method3 
{
    public static void m1() 
    {
        System.out.println("m1 is no argument method");
    }

    public static void m1(int a) 
    {
        System.out.println("m1 is 1 argument");
    }

    public static void m1(int a, int b) 
    {
        System.out.println("M1 is 2 argument");
    }

    public static void m1(int a, int b, int c) 
    {
        System.out.println("M1 is 3 argument");
    }

    public static void main(String[] arg)    //Main method 
    {
        m1();
        m1(10);
        m1(10, 20);
        m1(10, 20, 30);

    }

}
