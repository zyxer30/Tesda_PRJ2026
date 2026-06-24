/***
 * Task14.java
 *
 * Create a sublass of the abstract class and implement the abstract method.
 *
 * abstract class abstractClass {
 *  abstract void abstractMethod();
 *   void concreteMethod() { 
 *    // concrete methods are still allowed in abstract classes
 *    System.out.println("This is a concrete method.");
 *   }
 * }
 *
 * class B extends abstractClass {
 *  void abstractMethod() {
 *   System.out.println("B's implementation of abstractMehod.");
 *  }
 * }
 *
 * class C extends abstractClass {
 *  // Your code goes here
 * }
 * 
 * public class Task14{
 *  public static void main(String args[]) {
 *   B b = new B();
 *   b.abstractMethod();
 *   b.concreteMethod();
 *   C c = new C();
 *   c.abtractMethod();
 *   c.concreteMethod();
 *  }
 * }
 */

abstract class abstractClass {
    abstract void abstractMethod();
    
    void concreteMethod() {
        // concrete methods are still allowed in abstract classes
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstract Method.");
    }
}

class C extends abstractClass {
    // Your code goes here
    void abstractMethod() {
        System.out.println("C's implementation of abstract Method.");
    }
}

public class Task14 {
    public static void main(String args[]) {
        B b = new B();
        b.abstractMethod(); 
        b.concreteMethod();
        
        C c = new C();
        c.abstractMethod(); 
        c.concreteMethod();
    }
}
