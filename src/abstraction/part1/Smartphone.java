package abstraction.part1;

public class Smartphone extends Electronics{
    @Override
    public void operate() {
        if (isOn()) {
            System.out.println("Place a call");
        } else {
            System.out.println("Switch on your smartphone");
        }
    }
}
