//......................Hierarchical Inheritance.........................
/*
   When two or more classes inherits a single class, it is known as hierarchical inheritance.

   class A------>class B
   class A------>class C
*/

class A // Parent class or superclass
{
    void showA() {
        System.out.println("A class method");
    }
}

class B extends A // Child class or subclass (inheritate from class A)
{

    void showB() {
        System.out.println("B class method");
    }

}

class C extends A // child class or subclass (inheritate from class A)
{
    void showC() {
        System.out.println("C class method");
    }

    public static void main(String[] arg) {
        A obj1 = new A();
        obj1.showA();

        System.out.println("------------------------------->");

        B obj2 = new B();
        obj2.showA();
        obj2.showB();

        System.out.println("------------------------------->");

        C obj3 = new C();
        obj3.showA();
        obj3.showC();
    }
}