package abstraction.part8.part7;

public class Test {

    public static void main(String[] args) {
        Startable kia = new Kia();

        Startable[] cars = {kia};
        startAllCars(cars);
    }

    public static void startAllCars(Startable[] cars) {
        for (Startable car : cars) {
            car.start();
        }
    }
}
