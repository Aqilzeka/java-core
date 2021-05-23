package abstraction.part4;

public class Horse extends Animal implements Sellable, Rideable {
    @Override
    public void eat() {
        System.out.println("Horse eats hay");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps standing up");
    }

    @Override
    public double getPrice() {
        return 500;
    }

    @Override
    public void addRider(String name) {
        System.out.println(name + " is riding the horse");
    }
}