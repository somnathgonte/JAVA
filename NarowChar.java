public class NarowChar 
{
    public static void main(String[]arg){

        char ch = 'A';

        byte b =(byte)ch;
        short s =(short)ch;

        int i = ch;
        long l = ch;
        float f = ch;
        double d = ch;

        System.out.println(ch);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
    
}
