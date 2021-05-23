package abstraction.part2;

abstract class A extends Object {

    public A() {
        super();
        System.out.println("A ");
    }

    public abstract void m1();

}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }

    @Override
    public void m1() {
        System.out.println("B m1");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("C");
    }

    @Override
    public void m1() {
        System.out.println("C: m1");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        A a1 = new C();
        a1.m1();
    }
}