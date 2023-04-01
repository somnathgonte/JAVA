import java.math.*;
public class Method2
{
    void area(double r)                      //Called Method
    {
        double AreaOfCircle= Math.PI*r*r;
        System.out.println(AreaOfCircle);
    }
 
    public static void main(String []arg)    //Calling method (main Method)
    {
        double radius=3.0;

        Method2 mp = new Method2();          //Creating an object 
       //Create an object to create method without using static.
        mp.area(radius);                     //Method call
    }
}