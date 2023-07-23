//Initialise object by using method.


public class Animal3 
{
    String color;
    int age;

    void initObj(String c, int a)
    {
        color = c;
        age = a;

    }
    void display()
    {
        System.out.println(color+" "+age);
    }
    public static void main(String[] arg)
    {
        Animal3 buzz = new Animal3();          //Object creation.

        buzz.initObj("Black",10);
        buzz.display();
    }
}
