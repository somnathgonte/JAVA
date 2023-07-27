 //......................Multilevel Inheritance.........................
/*
   In Multi-Level Inheritance in Java, a class extends to another class that is already 
   extended from another class. 
   For example, if there is a class A that extends class B and class B extends from another class C, 
   then this scenario is known to follow Multi-level Inheritance.
 

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

class C extends B // child class or subclass (inheritate from class B)
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
        obj3.showB();
        obj3.showC();
    }
}