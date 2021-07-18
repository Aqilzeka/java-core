package abstraction.part8.part7;

public class Kia extends Car implements Startable, Stopable {
    @Override
    public void start() {
        System.out.println("Kia started");
    }

    @Override
    public void stop() {

    }

    @Override
    public void speedUp() {

    }
}
