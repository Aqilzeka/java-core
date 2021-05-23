package abstraction.part1;

public class Test {
    public static void main(String[] args) {

        /*
            Electronics is abstract thing it can be Phone, Camera and so
            Phone, Camera is real thing
         */
        Electronics e1 = new Smartphone();  // Polymorphism
        e1.powerOn();
        e1.operate();

        Electronics e2 = new Television("Star Sports");
        e2.powerOn();
        e2.operate();

        Electronics e3 = new Camera();
        e3.powerOn();
        e3.operate();

//        Electronics e4 = new Electronics() {      --> it crate new class Test$1
//            @Override
//            public void operate() {
//                System.out.println("New class");
//            }
//        };
//        e4.powerOn();
//        e4.operate();
    }
}
