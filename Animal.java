//Object creation.

public class Animal 
{
    public static void main(String []arg)
    {
        Animal buzo = new Animal();  //object creation using new keyword.
        buzo.eat();
        buzo.run();
    }

    public void eat()
    {
        System.out.println("I am eating");
    }

    public void run()
    {
        System.out.println("I am running");
    }
}
