//Write a java program to check whether a character is uppercase or lowercase alphabet.


import java.lang.*;
import java.util.*;

public class Condition3 {

    public static void main(String[] args) {

        System.out.println("Enter Character:");

        Scanner Sobj = new Scanner(System.in);
        
        char a = Sobj.next().charAt(0);   //taking input from user for character

        if (a >= 'A' && a <= 'Z') {
            System.out.println(a + " is in upper case");

        } else if (a >= 'a' && a <= 'z') {
            System.out.println(a + " is Lower case");

        } else {
            System.out.println("it is not alphabet");
        }
    }

}
