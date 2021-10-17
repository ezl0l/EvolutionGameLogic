public class Burrowing extends Property {
    public static final int food = 0;
    public static final int id = 4;
    public static final String name = "Burrowing";
    public static final int type = 0;
    public static final String description = "When an animal is fed, it cannot be attacked by a Carnivorous animal.";

    public Burrowing() {
        super(id, name, description, type, food);
    }
}
