//Take radius of circle as input and find area of circle.

import java.lang.*; //Library for output function
import java.util.*; //Library for input function

public class Area // Class name
{
    public static void main(String args[]) // Main method

    {
        System.out.println("Radius of circle: "); // for output or display

        Scanner Sobj = new Scanner(System.in); // for input
        long iNo1 = Sobj.nextInt(); // for input

        double iArea = 3.14 * (iNo1) * (iNo1); // formula area of circle

        System.out.println(iArea); // output
    }
}