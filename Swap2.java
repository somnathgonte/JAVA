import java.util.*;

public class Swap2 {
    public static void main(String[] args) {
        int a, b;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = Sobj.nextInt();

        System.out.println("Enter second number: ");
        b = Sobj.nextInt();

        System.out.println("Before swapping: " + a + " " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swapping: " + a + " " + b);
    }

}
