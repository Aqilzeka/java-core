package abstraction.part3;

public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println("Horse eats carrots");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps underground in burrow");
    }

    public double getPrice() {
        return 80;
    }
}
