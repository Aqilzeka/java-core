package abstraction.part8.part7;

public class Wolvo extends Car {
    @Override
    public void start() {
        System.out.println("Wolvo started");
    }

    @Override
    public void stop() {
        System.out.println("Wolvo stopped");
    }

    @Override
    public void speedUp() {
        System.out.println("Wolvo speed upped");
    }
}
