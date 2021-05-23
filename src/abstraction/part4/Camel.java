package abstraction.part4;

public class Camel extends Animal implements Sellable, Rideable{
    @Override
    public void eat() {
        System.out.println("Camel eats plants");
    }

    @Override
    public void sleep() {
        System.out.println("camel sleeps by laying sown on stomach");
    }

    @Override
    public double getPrice() {
        return 800;
    }

    @Override
    public void addRider(String name) {
        System.out.println(name + " is riding the camel");
    }

}
