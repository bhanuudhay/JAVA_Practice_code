class A // extends object
{
    public A() {
        super();
        System.out.println("Inside A constructor");
    }

    public A(int N) {
        super();
        System.out.println("Inside A  int constructor");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Inside B constructor");
    }

    public B(int B) {
        this(); // super()
        System.out.println("Inside B int  constructor");
    }
}
// basically calling the constructor of object class
// every constructor in java have a method that is super if u even not create
// call the constructor of super class that is the parent class
// in inhertiance if we explictly want to pass the parameterized constructor
// then we can use super
// in superclass this will call the constructor of same class

public class superclass {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        B obj = new B(7);

    }
}