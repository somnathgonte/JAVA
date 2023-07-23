//Initialise of object by referance variable.


public class Animal2 
{
    String color;
    int age;

    public static void main(String[] arg)
    {
        Animal2 buzo = new Animal2();    //Object creation.

        buzo.color = "black";
        buzo.age = 10;

        System.out.println(buzo.color+" "+buzo.age);
    }
}
