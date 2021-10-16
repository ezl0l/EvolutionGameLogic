public class Mimicry extends Property {
    public static final int food = 0;
    public static final int id = 0;
    public static final String name = "Mimicry";
    public static final int type = 0; // Ограничивающие съедение
    public static final String description = "If somebody want to eat you, you can redirect it to another your animal.";

    public Mimicry() {
        super(id, name, description, type, food);
    }
}
