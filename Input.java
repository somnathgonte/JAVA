

import java.util.*;    //package for input 



public class Input                            //--------->class block
{

    public static void main(String []args)                //------->Entry function ,main method 
    {
        
        Scanner Sobj = new Scanner(System.in);      //-------->Input statement

        int a;
        a = Sobj.nextInt(); 

        byte b;
        b = Sobj.nextByte();

        short s;
        s = Sobj.nextShort();

        char c;
        c = Sobj.next().charAt(0);

        long l;
        l = Sobj.nextLong();

        float f;
        f = Sobj.nextFloat();

        double d;
        d = Sobj.nextDouble();

        //String st;
        //st = Sobj.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        //System.out.println(st);






    }
}
