package abstraction.part3;

public class Test {
   private static void checkAnimal(Animal animal) {
       animal.eat();
       animal.sleep();

       if (animal instanceof Horse) {
           Horse horse = new Horse();
           System.out.println(horse.getPrice());
           horse.addRider("Tom");
       } else if (animal instanceof Rabbit) {
           Rabbit rabbit = new Rabbit();
           System.out.println(rabbit.getPrice());
       }
   }

    public static void main(String[] args) {
        Animal animal = new Horse();
        checkAnimal(animal);
    }
}
