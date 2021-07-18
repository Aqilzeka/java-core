package abstraction.part7;

public class Test {

    static class Test$1 extends Car {

        @Override
        public void start() {
            System.out.println("start");
        }

        @Override
        public void stop() {
            System.out.println("stop");
        }

        @Override
        public void speedUp() {
            System.out.println("speed up");
        }
    }

    public static void main(String[] args) {
        Wolvo wolvo = new Wolvo();
        wolvo.startAndSpeedUp();
        wolvo.setA(88);
        System.out.println(wolvo.getA());

        Car car = new Car() {
            @Override
            public void start() {
                
            }

            @Override
            public void stop() {

            }

            @Override
            public void speedUp() {

            }
        };

        class MethodClass extends Car {

            @Override
            public void start() {
                System.out.println("start");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }

            @Override
            public void speedUp() {
                System.out.println("speed up");
            }
        }

        // create inner class object
        BMW.InnerClass innerClass = new BMW().new InnerClass();

        // create nested class object
        BMW.NestedClass nestedClass = new BMW.NestedClass();
    }
}

class Test$1{

}
