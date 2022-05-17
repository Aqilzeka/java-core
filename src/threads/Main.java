package threads;

public class Main {
    public static void main(String[] args) {


        MyWorker myWorker1 = new MyWorker("Ali");
        MyWorker myWorker2 = new MyWorker("Ahmed");
        MyWorker myWorker3 = new MyWorker("Adil");
        MyWorker myWorker4 = new MyWorker("Lale");

        myWorker1.start();
        myWorker2.start();
        myWorker3.start();
        myWorker4.start();

    }
}
