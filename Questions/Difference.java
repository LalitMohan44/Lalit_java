package Lalit.Lalit_java.Questions;

// ABSTRACT Vs INTERFACE

//ABSTRACT
    // Abstract classes are similar to Interfaces. We cannot instantiate them, and they may
    // contain a mix of methods declared with or without an implementation.
    // However, with Abstract classes, we can declare fields that are not static and final, and
    // define public, protected and private concrete methods

    // An Abstract class can extend only one parent class but it can implement multiple Interfaces
    // When an Abstract class is subclassed, the subclass usually provides implementations for
    //all of the abstract methods in its parent class
    //However,if it does not, then the subclass must also be declared abstract.

    // The purpose of an Abstract class is to provide a common definition of a base
    //class that multiple derived classes can share.

// INTERFACE
    // An interface is just the declaration of methods of a Class, it's not the implementation
    // In an Interface, we define what kind of operation an object can perform These
    // operations are defined by the classes that implement the Interface

    // Interfaces form a contract between the class and the outside world, and this contract is
    // enforced at build time by the compiler

    // We cannot instantiate them, and they may contain a mix of methods declared with or
    // without an implementation. All methods in interfaces are automatically public and abstract

    // we want to specify the behavior of a particular data type, but we are not concerned
    // about who implements its behavior.
    // we want to separate different behavior.



 public class Difference {

     public static void main(String args[]) {
         A a = new M();
         a.a();
         a.b();
         a.c();
         a.d();
     }
 }

interface A{    //Interface
    void a();
    void b();
    void c();
    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class B implements A{
    public void c(){System.out.println("This is C");}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M extends B{
    public void a(){System.out.println("This is a");}
    public void b(){System.out.println("This is b");}
    public void d(){System.out.println("This is d");}
}

