package abstraction.part8.part7;

public abstract class Car extends Mechanic{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void speedUp();
    public void startAndSpeedUp(){
          this.start();
          this.speedUp();
    };
}
