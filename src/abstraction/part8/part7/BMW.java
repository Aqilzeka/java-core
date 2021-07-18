package abstraction.part8.part7;

public class BMW extends Car {

    //inner class
    public class InnerClass {
    }
    // nested class
    public static class NestedClass {
    }

    @Override
    public void start() {
        System.out.println("BMW started");
    }

    @Override
    public void stop() {
        System.out.println("BMW stopped");
    }

    @Override
    public void speedUp() {
        System.out.println("BMW speed upped");
    }
}
