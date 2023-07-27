//......................Single Inheritance.........................
/*
   Single inheritance in Java refers to the concept of a subclass inheriting 
   properties and behavior from a single superclass.
 

*/

class A                        //Parent class or superclass
{
    void showA()
    {
        System.out.println("JAY GANESHA........!");
    }
}


class B extends A                     //Child class or subclass
{

    void showB()
    {
        System.out.println("JAY SHRI RAM.....!");
    }
    public static void main(String[] arg)
    {
        A obj = new A();
        obj.showA();

        B obj2 = new B();
        obj2.showA();  
    }
}