//Area Of Reactangle

import java.util.*;

public class Area2 {
    public static void main(String arg[]) {
        System.out.println("Enter Length: ");

        Scanner Sobj = new Scanner(System.in);
        int Length = Sobj.nextInt();

        System.out.println("Enter Bredth: ");
        int Bredth = Sobj.nextInt();

        int Area = Length * Bredth;

        System.out.println("Area of rectangle is : " + Area);
    }
}
