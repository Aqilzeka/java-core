package wrapper_type.part1;

public class User {
    public int objectCount;

    public User() {
        objectCount++;
    }

    @Override
    public String toString() {
        return  objectCount + "";
    }
}
