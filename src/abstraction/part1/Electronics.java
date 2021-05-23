package abstraction.part1;

public abstract class Electronics {

    private boolean power = false;

    public Electronics(){
        System.out.println("Electronics class");
    }

    public final void powerOn() {
        power = true;
    }

    public final void powerOff() {
        power = false;
    }

    public final boolean isOn() {
        return power;
    }

    public abstract void operate();

}
