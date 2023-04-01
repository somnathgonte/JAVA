/* No Arguments Method
   Method declaration without formal argument are called “No Arguments Method”.
   No Arguments Method can’t accept any kind of input (data).
   Syntax to call No Argument Method: - methodName();
*/

public class Method4
{
    public static void main(String []args)
    { 
        System.out.println("Main Method");
        m1();
    }

    public static void m1()  //Method declaration
    {
        System.out.println("M1 method");
    }
}

/* 
    Parameterized Method (Methods with formal Arguments)
    Methods with formal arguments known as Parameterized Method.
    It is used to accept data whenever it is called.
*/

class Method
{
    public static void main(String[] args)
    {
        int a=5;
        int b=10;
        String name="abcd";
        m1(a, b, name);
    }
    public static void m1(int a, int b, String name)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
    }
}