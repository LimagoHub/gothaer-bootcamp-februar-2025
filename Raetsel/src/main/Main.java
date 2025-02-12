package main;

public class Main {
    public static void main(String[] args) {

        new B();
        new B();
    }
}

class A {
    static{
        System.out.println("1 ");
    }
    {
        System.out.println("6 ");
    }

    public A() {
        System.out.println("2 ");
        foo();
    }

    public void foo() {
        System.out.println("3 ");
    }
}

class B extends A {
    public B() {
        System.out.println("4 ");
    }
    public void foo() {
        System.out.println("5 ");
    }
}