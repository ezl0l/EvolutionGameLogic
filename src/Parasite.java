public class Parasite extends Property {
    public static final int food = 2;
    public static final int id = 6;
    public static final String name = "Parasite";
    public static final int type = -2; // Parasite type
    public static final String description = "You can use it only on animal of other player.";

    public Parasite() {
        super(id, name, description, type, food);
    }
}
