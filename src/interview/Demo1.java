package interview;

public class Demo1 {

    int count = 0;

    public synchronized int getCountOne() {
        return count++;
    }

    public int getCountOne_1() {
        synchronized(this) {
            return count++;
        }
    }

    public int getCountTwo() {
        synchronized(Demo1.class) {
            return count++;
        }
    }
}
