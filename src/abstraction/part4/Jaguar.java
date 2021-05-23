package abstraction.part4;

public class Jaguar extends Animal {
    @Override
    public void eat() {
        System.out.println("Horse eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps in trees");
    }
}
