
//Find maximum between two numbers

import java.util.*;

public class Condtion4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is maximum ");
        } else {
            System.out.println(b + " is maximum");
        }

    }

}
