package abstraction.part4;

public class Rabbit extends Animal implements Sellable{
    @Override
    public void eat() {
        System.out.println("Horse eats carrots");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps underground in burrow");
    }

    @Override
    public double getPrice() {
        return 80;
    }
}
