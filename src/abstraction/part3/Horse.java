package abstraction.part3;

public class Horse extends Animal {
    @Override
    public void eat() {
        System.out.println("Horse eats hay");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps standing up");
    }

    public double getPrice() {
        return 500;
    }

    public void addRider(String name) {
        System.out.println(name + " is riding the horse");
    }
}