package immutableobjects;

/*
1. Make all attributes private and final.
2. Don't provide any methods that modify the object state.
3. Ensure the class cannot be extended.
4. Ensure exclusive access to any mutable attributes.
 */
public final class ImmutableSpaceShip {
    private final String name;
    private final Destination destination;

    public ImmutableSpaceShip(String name) {
        this.name = name;
        this.destination =Destination.NONE;
    }

    public ImmutableSpaceShip(String name, Destination destination) {
        this.name = name;
        this.destination = destination;
    }

    public Destination currentDestination() {
        return destination;
    }

    public ImmutableSpaceShip exploreGalaxy() {
        return new ImmutableSpaceShip(name, Destination.OUTER_SPACE);
    }

    @Override
    public String toString() {
        return "ImmutableSpaceShip{" +
                "name='" + name + '\'' +
                ", destination=" + destination +
                '}';
    }
}
