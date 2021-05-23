package abstraction.part4;

public class Test {
   private static void checkAnimal(Animal animal) {
       animal.eat();
       animal.sleep();

       if (animal instanceof Sellable sellable) {
           System.out.println(sellable.getPrice());
       }

       if (animal instanceof  Rideable rideable) {
           rideable.addRider("Tom");
       }

//       if (animal instanceof Horse) {
//           Horse horse = new Horse();
//           System.out.println(horse.getPrice());
//           horse.addRider("Tom");
//       } else if (animal instanceof Rabbit) {
//           Rabbit rabbit = new Rabbit();
//           System.out.println(rabbit.getPrice());
//       } else if (animal instanceof Camel) {
//           Camel camel = new Camel();
//           System.out.println(camel.getPrice());
//           camel.addRider("Tom");
//       }

   }
    public static void main(String[] args) {
        Animal animal = new Horse();
        checkAnimal(animal);
    }
}
