package immutableobjects;

public class Test {
    public static void main(String[] args) {
        ImmutableSpaceShip immutableSpaceShip = new ImmutableSpaceShip("Test1");
        Destination destination = immutableSpaceShip.currentDestination();
        System.out.println(destination);
        ImmutableSpaceShip immutableSpaceShip1 = immutableSpaceShip.exploreGalaxy();
        System.out.println(immutableSpaceShip1);
        ImmutableSpaceShip immutableSpaceShip2 = immutableSpaceShip1.exploreGalaxy();
        System.out.println(immutableSpaceShip2.equals(immutableSpaceShip1));
    }
}
