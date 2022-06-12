package immutableobjects;

public enum Destination {
    NONE("none"),
    OUTER_SPACE("outerSpace");
    private final String type;
    Destination(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
